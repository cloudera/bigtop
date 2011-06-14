//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/posix/UGI.groovy
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

public class UGI
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    /**
     * Local cache for POSIX user information (as specified in /etc/passwd).
     * The key is a username and values are maps with the following information for
     * each user: passwd (password), uid (numeric user ID), gid (numeric group ID),
     * descr (textual user description), home (user home directory),
     * shell (default shell of the user).
     * 
     * NOTE: all these bits of information are stored as Strings (even uid, gid).
     */
    private Map users = null;
    public Map getUsers() {
        throw new InternalError("Stubbed method");
    }
    public void setUsers(Map value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Local cache for POSIX group information (as specified in /etc/group).
     * The key is a groupname and values are maps with the following information for
     * each group: passwd (password), gid (numeric group ID), users (list of all users
     * belonging to this group as reported by id(1)).
     * 
     * NOTE: all these bits of information are stored as Strings (even gid).
     */
    private Map groups = null;
    public Map getGroups() {
        throw new InternalError("Stubbed method");
    }
    public void setGroups(Map value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Magic constructor
     */
    private UGI(java.lang.Void void0, java.lang.Void void1, java.lang.Void void2) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Synchronizes caches (users and groups) with /etc/passwd and /etc/group
     */
    public void refresh() {
        throw new InternalError("Stubbed method");
    }

    public UGI() {
        this((java.lang.Void)null, (java.lang.Void)null, (java.lang.Void)null);
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
