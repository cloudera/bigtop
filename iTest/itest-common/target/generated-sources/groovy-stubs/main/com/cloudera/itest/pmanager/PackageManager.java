//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/pmanager/PackageManager.groovy
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
import com.cloudera.itest.shell.Shell;
import com.cloudera.itest.shell.OS;
import com.cloudera.itest.posix.Service;

public abstract class PackageManager
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    /**
     * type of a package manager. expected to be overwritten by concrete subclasses implementing
     * particular package managers (yum, apt, zypper, etc.)
     */
    static private java.lang.String type = null;
    static public java.lang.String getType() {
        throw new InternalError("Stubbed method");
    }
    static public void setType(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

    /**
     * A registry location for repositories to be added to. Currently all the package managers
     * we have to support can be handled by treating this as a subdirectory in a local filesystem.
     */
    static private java.lang.String repository_registry = null;
    static public java.lang.String getRepository_registry() {
        throw new InternalError("Stubbed method");
    }
    static public void setRepository_registry(java.lang.String value) {
        throw new InternalError("Stubbed method");
    }

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
     * Set package manager specific default values
     *
     * @param defaults String of default values encoded in a package manager specific way
     */
    abstract public void setDefaults(java.lang.String defaults);

    /**
     * Register a binary package repository so that packages can be accessed from it.
     * NOTE: repository management is assumed to follow a KVP API with unique implementation
     * specific keys (records) referencing tuples of information describing a repository
     *
     * @param record a package manager specific KEY portion of the repository registration (null is default)
     * @param url a URL containing the packages constituting the repository (null is default)
     * @param key an optional (can be null) cryptographic key for authenticating the content of the repository
     * @param cookie an optional, package manager specific opaque string
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int addBinRepo(java.lang.String record, java.lang.String url, java.lang.String key, java.lang.String cookie);

    /**
     * Register a binary package repository so that packages can be accessed from it.
     * NOTE: repository management is assumed to follow a KVP API with unique implementation
     * specific keys (records) referencing tuples of information describing a repository
     *
     * @param record a package manager specific KEY portion of the repository registration (null is default)
     * @param descr a full description of the repository in a native format
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    public int addBinRepo(java.lang.String record, java.lang.String descr) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Clean up the repository cache
     *
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int cleanup();

    /**
     * Refresh the cached data describing the content of all registered repositories
     *
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int refresh();

    /**
     * De-register a binary package repository.
     *
     * @param record a package manager specific KEY portion of the repository registration (null is default)
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    public int removeBinRepo(java.lang.String record) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Search for a package in all registered repositories
     *
     * @param name name of the package (inexact matches are ok)
     * @param version a particular version of the package
     * @return list of matching packages found in all registered repositories (can be empty)
     */
    abstract public List search(java.lang.String name);

    /**
     * Search for a package in all registered repositories
     *
     * @param name name of the package (inexact matches are ok)
     * @param version a particular version of the package
     * @return list of matching packages found in all registered repositories (can be empty)
     */
    abstract public List lookup(java.lang.String name);

    /**
     * Install a given package (from collection of all the packages available in all the repositories)
     *
     * @param pkg a package to be installed
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int install(PackageInstance pkg);

    /**
     * Remove a given package that is already installed on the system
     *
     * @param pkg a package to be installed
     * @return int return code of the operation: o in case of success, non-zero otherwise
     */
    abstract public int remove(PackageInstance pkg);

    /**
     * Check if a given package is installed on the system
     *
     * @param pkg a package to be checked
     * @return true if the package is installed and can be used, false otherwise
     */
    abstract public boolean isInstalled(PackageInstance pkg);

    /**
     * Create a package a given file in a filesystem belongs to
     *
     * @param file filename
     * @return a package that the file belongs to or null
     */
    abstract public PackageInstance lookupFile(java.lang.String file);

    /**
     * Get a list of services (System V init scripts) provided by a given package
     *
     * @param pkg a package that is expected to provide 0, 1 or multiple services
     * @return list of Service instances
     */
    public Map getServices(PackageInstance pkg) {
        throw new InternalError("Stubbed method");
    }

    /**
     * List a content of a given package
     *
     * @param pkg a package that is expected to provide >1 entry in its content
     * @return list file and directory names belong to the package.
     */
    public List getContentList(PackageInstance pkg) {
        throw new InternalError("Stubbed method");
    }

    /**
     * List config files in a given package
     *
     * @param pkg a package in question
     * @return list config file names that belong to the package.
     */
    public List getConfigs(PackageInstance pkg) {
        throw new InternalError("Stubbed method");
    }

    /**
     * List documentation files in a given package
     *
     * @param pkg a package in question
     * @return list documentation file names that belong to the package.
     */
    public List getDocs(PackageInstance pkg) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Returns a concrete implementation of PackageManager specific for the distro
     * where the code is executed (e.g. this OS)
     *
     * @return instance of a concrete implementation of PackageManager
     */
    static public PackageManager getPackageManager() {
        throw new InternalError("Stubbed method");
    }

    /**
     * Operate on services provided by a package (start, stop, status, restart)
     * NOTE: this method assumes that a given package bundles a number of services (daemons)
     * and allows you to operate on these services without requiring an explicit knowledge
     * of their names. If a single package provides multiple services all of them will
     * be operated on simultaneously (you don't get to choose any subsets). If a package
     * doesn't provide any services calling this method is a noop.
     *
     * @param pkg a package that is expected to provide 0, 1 or multiple services
     * @param action what to do with service(s) (start, stop, status, restart)
     * @deprecated it is now recommended to use getServices() instead
     */
    public void svc_do(PackageInstance pkg, java.lang.String action) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Returns a concrete implementation of PackageManager specific for a given linux
     * flavor.
     *
     * @param linux_flavor e.g. ubuntu, debian, redhat, centos, etc.
     * @return instance of a concrete implementation of PackageManager
     */
    static public PackageManager getPackageManager(java.lang.String linux_flavor) {
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
