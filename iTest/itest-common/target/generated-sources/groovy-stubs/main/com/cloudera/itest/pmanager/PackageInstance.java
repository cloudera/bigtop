//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/pmanager/PackageInstance.groovy
//

package com.cloudera.itest.pmanager;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.cloudera.itest.posix.Service;

abstract public class PackageInstance
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    private PackageManager mgr = null;
    public PackageManager getMgr() {
        throw new InternalError("Stubbed method");
    }
    public void setMgr(PackageManager value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String name = null;
    public java.lang.String getName() {
        throw new InternalError("Stubbed method");
    }
    public void setName(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String version = null;
    public java.lang.String getVersion() {
        throw new InternalError("Stubbed method");
    }
    public void setVersion(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String release = null;
    public java.lang.String getRelease() {
        throw new InternalError("Stubbed method");
    }
    public void setRelease(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String arch = null;
    public java.lang.String getArch() {
        throw new InternalError("Stubbed method");
    }
    public void setArch(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private Map meta = null;
    public Map getMeta() {
        throw new InternalError("Stubbed method");
    }
    public void setMeta(Map value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String installMessages = null;
    public java.lang.String getInstallMessages() {
        throw new InternalError("Stubbed method");
    }
    public void setInstallMessages(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    protected List files = null;

    protected List docs = null;

    protected List configs = null;

    protected Map services = null;

    protected Map deps = null;

    /**
     * Check if this package is installed on the system
     *
     * @return true if the package is installed and can be used, false otherwise
     */
    abstract public boolean isInstalled();

    /**
     * Install this package (from collection of all the packages available in all the repositories)
     *
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int install();

    /**
     * Remove this package from a system
     *
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int remove();

    /**
     * Re-sync metadata associated with this package with the underlying package management system
     *
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public void refresh();

    /**
     * Get a list of services (System V init scripts) provided by this package
     *
     * @return list of Service instances
     */
    abstract public Map getServices();

    /**
     * Get a list of files provided by this package. This list will include ALL the files regardless
     * of whether they are also marked as configs or documentation.
     *
     * @return list file and directory names belong to the package.
     */
    abstract public List getFiles();

    /**
     * Get a list of documentation files provided by this package (if the underlying package
     * management system doesn't support a notion of a documentation file -- empty list is expected
     * to be returned.
     *
     * @return list config file names that belong to the package.
     */
    abstract public List getDocs();

    /**
     * Get a list of configuration files provided by this package (if the underlying package
     * management system doesn't support a notion of a configuration file -- empty list is expected
     * to be returned.
     *
     * @return list config file names that belong to the package.
     */
    abstract public List getConfigs();

    /**
     * Get a list of dependencies for this package. Dependency information is stored in a map with
     * keys being names of the objects and values being version information in the following format:
     * [version operator] version
     * E.g. >= 3.3.1+10
     *
     * @return map of objects (mostly packaged) this package depends on
     */
    abstract public Map getDeps();

    /**
     * Factory method for creating an instance of a Package that can reside in
     * a particular instance of a PackageManager.
     * NOTE: For now only 'natural' pairing is supported (e.g. deb with apt, rpm
     * with yum/zypper)
     *
     * @param mgr package manager that is expected to manage this type of package
     * @param name package manager dependent name of a package
     */
    static public PackageInstance getPackageInstance(PackageManager mgr, java.lang.String name) {
        throw new InternalError("Stubbed method");
    }

    public groovy.lang.MetaClass getMetaClass() {
        throw new InternalError("Stubbed method");
    }

    public void setMetaClass(groovy.lang.MetaClass metaClass) {
        throw new InternalError("Stubbed method");
    }

    public java.lang.Object invokeMethod(java.lang.String name, java.lang.Object args) {
        throw new InternalError("Stubbed method");
    }

    public java.lang.Object getProperty(java.lang.String name) {
        throw new InternalError("Stubbed method");
    }

    public void setProperty(java.lang.String name, java.lang.Object value) {
        throw new InternalError("Stubbed method");
    }
}
