//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/pmanager/RPMPackage.groovy
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
import com.cloudera.itest.shell.Shell;

public class RPMPackage
    extends ManagedPackage
    implements groovy.lang.GroovyObject
{
    private Shell shRoot = null;
    public Shell getShRoot() {
        throw new InternalError("Stubbed method");
    }
    public void setShRoot(Shell value) {
        throw new InternalError("Stubbed method");
    }

    private Shell shUser = null;
    public Shell getShUser() {
        throw new InternalError("Stubbed method");
    }
    public void setShUser(Shell value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * A helper method that parses a stream of metadata describing one or more packages.
     * 
     * NOTE: the design of this is a bit ugly, we need to rethink how it is done.
     *
     * @param givenPkg a package to which the beginning of the metadata stream applies
     * @param text stream of metadata as a list of Strings
     * @param pm a package manager that this package belong to
     * @return list of EXTRA packages that were detected (and created!) during metadata parsing
     */
    public static List parseMetaOutput(PackageInstance givenPkg, List text, PackageManager pm) {
        throw new InternalError("Stubbed method");
    }

    public void refresh() {
        throw new InternalError("Stubbed method");
    }

    public Map getServices() {
        throw new InternalError("Stubbed method");
    }

    public List getFiles() {
        throw new InternalError("Stubbed method");
    }

    public List getConfigs() {
        throw new InternalError("Stubbed method");
    }

    public List getDocs() {
        throw new InternalError("Stubbed method");
    }

    public Map getDeps() {
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
