//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/posix/Service.groovy
//

package com.cloudera.itest.posix;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.cloudera.itest.shell.Shell;

public class Service
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    private java.lang.String svc_name = null;

    private List run_levels = null;

    private Shell shRoot = null;

    private Shell sh = null;

    /**
     * Magic constructor
     */
    private Service(java.lang.Void void0, java.lang.Void void1, java.lang.Void void2) {
        throw new InternalError("Stubbed method");
    }

    public Service(java.lang.String name) {
        this((java.lang.Void)null, (java.lang.Void)null, (java.lang.Void)null);
        throw new InternalError("Stubbed method");
    }

    /**
     * Start a System V service via a service(8)
     *
     * @return exit code of a service(8) call
     */
    public int start() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Stop a System V service via a service(8)
     *
     * @return exit code of a service(8) call
     */
    public int stop() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Restart a System V service via a service(8)
     *
     * @return exit code of a service(8) call
     */
    public int restart() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Get a status of a System V service via a service(8)
     *
     * @return an output of a service(8) call
     */
    public java.lang.String status() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Returns name of the service
     *
     * @return service name
     */
    public java.lang.String getName() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Returns a list of runlevels this service is registered for (we do lazy loading of run level info)
     *
     * @return list of run levels as strings (we'd use list of integers but there's "S" run level)
     */
    public List getRunLevels() {
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
