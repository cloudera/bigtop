%define etc_flume /etc/flume/conf
%define bin_flume %{_bindir}
%define doc_flume %{_docdir}/flume-%{flume_version}
%define man_flume %{_mandir}
%define lib_flume /usr/lib/flume
%define log_flume /var/log/flume
%define flume_services master node

%if  %{?suse_version:1}0

# Only tested on openSUSE 11.4. le'ts update it for previous release when confirmed
%if 0%{suse_version} > 1130
%define suse_check \# Define an empty suse_check for compatibility with older sles
%endif

# SLES is more strict and check all symlinks point to valid path
# But we do point to a hadoop jar which is not there at build time
# (but would be at install time).
# Since our package build system does not handle dependencies,
# these symlink checks are deactivated
%define __os_install_post \
    %{suse_check} ; \
    /usr/lib/rpm/brp-compress ; \
    %{nil}

%define alternatives_cmd update-alternatives
%global initd_dir %{_sysconfdir}/rc.d

%else

%define alternatives_cmd alternatives
%global initd_dir %{_sysconfdir}/rc.d/init.d

%endif



Name: flume
Version: %{flume_version}
Release: %{flume_release}
Summary:  Flume is a reliable, scalable, and manageable distributed log collection application for collecting data such as logs and delivering it to data stores such as Hadoop's HDFS.
URL: https://github.com/cloudera/flume
Group: Development/Libraries
Buildroot: %{_topdir}/INSTALL/%{name}-%{version}
BuildArch: noarch
License: APL2
Source0: flume-distribution-%{flume_base_version}-bin.tar.gz
Source1: init.d
Source2: init.d.suse
Source3: install_flume.sh
Requires: sh-utils, textutils, /usr/sbin/useradd, /sbin/chkconfig, /sbin/service, hadoop-zookeeper >= 3.3.1, hadoop >= 0.20.2

# RHEL6 provides natively java
%if 0%{?rhel} == 6
Requires: java-1.6.0-sun
%else
Requires: jre >= 1.6
%endif


%description 
Flume is a reliable, scalable, and manageable distributed data collection application for collecting data such as logs and delivering it to data stores such as Hadoop's HDFS.  It can efficiently collect, aggregate, and move large amounts of log data.  It has a simple, but flexible, architecture based on streaming data flows.  It is robust and fault tolerant with tunable reliability mechanisms and many failover and recovery mechanisms.  The system is centrally managed and allows for intelligent dynamic management. It uses a simple extensible data model that allows for online analytic applications.

%package master
Summary: The flume master daemon is the central administration and data path control point for flume nodes.
Group: Development/Libraries
BuildArch: noarch
Requires: %{name} = %{version}-%{release}
Requires: sh-utils, textutils, /usr/sbin/useradd, /sbin/chkconfig, /sbin/service
Requires(post): /sbin/chkconfig
Requires(preun): /sbin/service, /sbin/chkconfig, %{name}

# RHEL6 provides natively java
%if 0%{?rhel} == 6
Requires: java-1.6.0-sun
%else
Requires: jre >= 1.6
%endif

%if  %{?suse_version:1}0
# Required for init scripts
Requires: insserv
%else
# Required for init scripts
Requires: redhat-lsb
%endif


%description master
Flume is a reliable, scalable, and manageable distributed data collection application for collecting data such as logs and delivering it to data stores such as Hadoop's HDFS.  It can efficiently collect, aggregate, and move large amounts of log data.  It has a simple, but flexible, architecture based on streaming data flows.  It is robust and fault tolerant with tunable reliability mechanisms and many failover and recovery mechanisms.  The system is centrally managed and allows for intelligent dynamic management. It uses a simple extensible data model that allows for online analytic applications.

%package node
Summary: The flume node daemon is a core element of flume's data path and is responsible for generating, processing, and delivering data.
Group: Development/Libraries
BuildArch: noarch
Requires: %{name} = %{version}-%{release}
Requires: sh-utils, textutils, /usr/sbin/useradd, /sbin/chkconfig, /sbin/service
Requires(post): /sbin/chkconfig
Requires(preun): /sbin/service, /sbin/chkconfig, %{name}

# RHEL6 provides natively java
%if 0%{?rhel} == 6
Requires: java-1.6.0-sun
%else
Requires: jre >= 1.6
%endif

%if  %{?suse_version:1}0
# Required for init scripts
Requires: insserv
%else
# Required for init scripts
Requires: redhat-lsb
%endif


%description node
Flume is a reliable, scalable, and manageable distributed data collection application for collecting data such as logs and delivering it to data stores such as Hadoop's HDFS.  It can efficiently collect, aggregate, and move large amounts of log data.  It has a simple, but flexible, architecture based on streaming data flows.  It is robust and fault tolerant with tunable reliability mechanisms and many failover and recovery mechanisms.  The system is centrally managed and allows for intelligent dynamic management. It uses a simple extensible data model that allows for online analytic applications.

%prep
%setup -n %{name}-distribution-%{flume_base_version}

%build
true

%install
%__rm -rf $RPM_BUILD_ROOT
sh $RPM_SOURCE_DIR/install_flume.sh \
          --build-dir=. \
          --prefix=$RPM_BUILD_ROOT \
          --doc-dir=%{doc_flume}
%__install -d -m 0755 $RPM_BUILD_ROOT/%{initd_dir}/


%if  %{?suse_version:1}0
orig_init_file=$RPM_SOURCE_DIR/init.d.suse
%else
orig_init_file=$RPM_SOURCE_DIR/init.d
%endif

for service in %{flume_services}
do
        init_file=$RPM_BUILD_ROOT/%{initd_dir}/%{name}-${service}
        %__cp $orig_init_file $init_file
        %__sed -i -e "s|@FLUME_DAEMON@|${service}|" $init_file
        chmod 755 $init_file
done

%__install -d -m 0755 $RPM_BUILD_ROOT/usr/bin

# Get rid of hadoop jar, and instead link to installed hadoop
rm $RPM_BUILD_ROOT/usr/lib/flume/lib/hadoop-*
ln -s /usr/lib/hadoop/hadoop-core.jar $RPM_BUILD_ROOT/usr/lib/flume/lib/hadoop-core.jar

%pre
getent group flume >/dev/null || groupadd -r flume
getent passwd flume >/dev/null || useradd -c "Flume" -s /sbin/nologin -g flume -r -d /var/run/flume flume 2> /dev/null || :
%__install -d -o flume -g flume -m 0755 /var/run/flume
%__install -d -o flume -g flume -m 0755 /var/log/flume

# Manage configuration symlink
%post
%{alternatives_cmd} --install %{etc_flume} %{name}-conf %{etc_flume}.empty 30

%preun
if [ "$1" = 0 ]; then
        %{alternatives_cmd} --remove %{name}-conf %{etc_flume}.empty
fi

%files 
%defattr(-,flume,flume)
%config %{etc_flume}.empty
%doc %{doc_flume}

%attr(0755,root,root) %{bin_flume}
%attr(0755,root,root) %{lib_flume}

%define service_macro() \
%files %1 \
%attr(0755,root,root)/%{initd_dir}/%{name}-%1 \
%attr(0755,root,root)%{lib_flume}/bin/flume-daemon.sh \
%dir %{lib_flume}/bin \
%dir %{lib_flume} \
%post %1 \
chkconfig --add %{name}-%1 \
\
%preun %1 \
if [ "$1" = 0 ] ; then \
        service %{name}-%1 stop > /dev/null \
        chkconfig --del %{name}-%1 \
fi
%service_macro node
%service_macro master
