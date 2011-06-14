//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/posix/Alternative.groovy
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

public class Alternative
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    private java.lang.String name = null;
    public java.lang.String getName() {
        throw new InternalError("Stubbed method");
    }
    public void setName(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String best = null;
    public java.lang.String getBest() {
        throw new InternalError("Stubbed method");
    }
    public void setBest(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String value = null;
    public java.lang.String getValue() {
        throw new InternalError("Stubbed method");
    }
    public void setValue(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private java.lang.String status = null;
    public java.lang.String getStatus() {
        throw new InternalError("Stubbed method");
    }
    public void setStatus(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    private Map alts = null;
    public Map getAlts() {
        throw new InternalError("Stubbed method");
    }
    public void setAlts(Map value) {
        throw new InternalError("Stubbed method");
    }

    private Shell shUser = null;
    public Shell getShUser() {
        throw new InternalError("Stubbed method");
    }
    public void setShUser(Shell value) {
        throw new InternalError("Stubbed method");
    }

    private Shell shRoot = null;
    public Shell getShRoot() {
        throw new InternalError("Stubbed method");
    }
    public void setShRoot(Shell value) {
        throw new InternalError("Stubbed method");
    }

    static private java.lang.String listCmd = null;

    /**
     * Magic constructor
     */
    private Alternative(java.lang.Void void0, java.lang.Void void1, java.lang.Void void2) {
        throw new InternalError("Stubbed method");
    }

    private void parse_query(List metadata) {
        throw new InternalError("Stubbed method");
    }

    private void parse_display(List metadata) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Refreshes the state of in-memeory representation of a Linux alternative (see update-alternatives(8)
     * for details on how they work). The following bits of information for each alternative are
     * cached: name (name of the alternative), best (current selection of a best alternative target),
     * value (where does this alternative currently points), status (automatic or manual).
     * 
     * The alternatives themselves (including slave ones) are kept in a map alts, where each key is a
     * target and values are maps holding information for slaves.
     */
    public void refresh() {
        throw new InternalError("Stubbed method");
    }

    public Alternative(java.lang.String n) {
        this((java.lang.Void)null, (java.lang.Void)null, (java.lang.Void)null);
        throw new InternalError("Stubbed method");
    }

    /**
     * Adding another target to the alternative. An alternative needs NOT exist in order
     * for target to be added.
     *
     * @param link an alternative link that is a well-known file location for this alternative
     * @param path a target path (one of the choices for link to actually point to)
     * @param priority a numeric priority for this alternative
     * @param slaves a list os slave links (possibly empty)
     * @return UNIX error code of an update-alternatives --install command
     */
    public int add(java.lang.String link, java.lang.String path, java.lang.String priority, List slaves) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Removing one of the choices (a path name to point to) from this alternative.
     *
     * @param path a target path (one of the choices for alternative's link to actually point to)
     * @return UNIX error code of an update-alternatives --remove command
     */
    public int remove(java.lang.String path) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Removing ALL of the choices (path names to point to) from this alternative.
     *
     * @return UNIX error code of an update-alternatives --remove-all command
     */
    public int removeAll() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Switch the link for this alternative to to one of the path names registered under it.
     *
     * @param path a target path (one of the choices for alternative's link to actually point to)
     * @return UNIX error code of an update-alternatives --set command
     */
    public int set(java.lang.String path) {
        throw new InternalError("Stubbed method");
    }

    /**
     * A factory method producing all of the alternatives registered on this system.
     *
     * @return All the alternatives registered on this system
     */
    public static Map getAlternatives() {
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
