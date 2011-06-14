//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/shell/Shell.groovy
//

package com.cloudera.itest.shell;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Shell
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    static private Log LOG = null;

    static private final java.lang.String DEFAULT_SHELL = null;

    private java.lang.String shell = null;
    public java.lang.String getShell() {
        throw new InternalError("Stubbed method");
    }
    public void setShell(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String user = null;
    public java.lang.String getUser() {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String script = null;
    public java.lang.String getScript() {
        throw new InternalError("Stubbed method");
    }
    public void setScript(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private List out = null;
    public List getOut() {
        throw new InternalError("Stubbed method");
    }
    public void setOut(List value) {
        throw new InternalError("Stubbed method");
    }

    private List err = null;
    public List getErr() {
        throw new InternalError("Stubbed method");
    }
    public void setErr(List value) {
        throw new InternalError("Stubbed method");
    }

    private int ret = 0;
    public int getRet() {
        throw new InternalError("Stubbed method");
    }
    public void setRet(int value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Magic constructor
     */
    private Shell(java.lang.Void void0, java.lang.Void void1, java.lang.Void void2) {
        throw new InternalError("Stubbed method");
    }

    public Shell(java.lang.String sh) {
        this((java.lang.Void)null, (java.lang.Void)null, (java.lang.Void)null);
        throw new InternalError("Stubbed method");
    }

    public Shell(java.lang.String sh, java.lang.String u) {
        this((java.lang.Void)null, (java.lang.Void)null, (java.lang.Void)null);
        throw new InternalError("Stubbed method");
    }

    public Shell() {
        this((java.lang.Void)null, (java.lang.Void)null, (java.lang.Void)null);
        throw new InternalError("Stubbed method");
    }

    public void setUser(java.lang.String u) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Execute shell script consisting of as many Strings as we have arguments,
     * possibly under an explicit username (requires sudoers privileges).
     * NOTE: individual strings are concatenated into a single script as though
     * they were delimited with new line character. All quoting rules are exactly
     * what one would expect in standalone shell script.
     * 
     * After executing the script its return code can be accessed as getRet(),
     * stdout as getOut() and stderr as getErr(). The script itself can be accessed
     * as getScript()
     * WARNING: it isn't thread safe
     *
     * @param args shell script split into multiple Strings
     * @return Shell object for chaining
     */
    public Shell exec(java.lang.Object args) {
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
