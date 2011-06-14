//
// Generated stub from file:/home/rvs/src/iTest/itest-common/src/main/groovy/com/cloudera/itest/JarContent.groovy
//

package com.cloudera.itest;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipException;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public abstract class JarContent
    extends java.lang.Object
    implements groovy.lang.GroovyObject
{
    static private Log LOG = null;

    private static List patterns = null;

    private static List content = null;

    public static java.lang.Object defaultExclPattern = null;

    /**
     * Lists content of a given jar file excluding defaultExclPattern and any extra
     * patterns set via {@link JarContent#setPatterns} call
     *
     * @param jarFileName file for a jar
     * @return list of Strings representing jar's entries
     * @throws IOException if file isn't found and anything else goes wrong
     */
    static public List listContent(java.lang.String jarFileName) throws IOException {
        throw new InternalError("Stubbed method");
    }

    private static java.lang.String process(JarEntry jarEntry) throws IOException {
        throw new InternalError("Stubbed method");
    }

    /**
     * Set a list of new patterns to be applied in the processing of a jar file
     *
     * @param filterPatters list of pattern strings
     * @return list of currently set patterns. Next call of this method will
reset the content of patterns' list.
     */
    static public List setPatterns(List filterPatters) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Filter out any entries which match given patterns
     *
     * @param list of entries
     * @param filters list of patterns
     * @return filtered-out list of entries
     */
    static public List applyExcludeFilter(final List list, final List filters) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Finds JAR URL of an object's class belongs to
     *
     * @param ref Class reference of a class belongs to a jar file
     * @return JAR URL or <code>null</code> if class doesn't belong
to a JAR in the classpath
     */
    public static URL getJarURL(Class ref) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Finds JAR URL of an object's class belongs to
     *
     * @param className is full name of the class e.g. java.lang.String
     * @return JAR URL or <code>null</code> if class doesn't belong
to a JAR in the classpath
     * @throws ClassNotFoundException if class specified by className wasn't found
     */
    public static URL getJarURL(java.lang.String className) throws ClassNotFoundException {
        throw new InternalError("Stubbed method");
    }

    /**
     * Returns full name of a jar file by a pattern
     *
     * @param baseDir to look for a jar under
     * @param namePattern to look for a jar by
     * @return name of the jar file if found; <code>null</code> otherwise
     */
    public static java.lang.String getJarName(java.lang.String baseDir, java.lang.String namePattern) {
        throw new InternalError("Stubbed method");
    }

    /**
     * Finds and unpack a jar file by locating to what jar file a given class belongs
     * and unpacking jar content to desalination according to given includes
     *
     * @param ref
     * @param destination
     * @param includes
     * @throws IOException if can't find class' jar file in the classpath
     */
    public static void unpackJarContainer(Class ref, java.lang.String destination, java.lang.String includes) throws IOException {
        throw new InternalError("Stubbed method");
    }

    public static java.lang.Object unpackJarContainer(java.lang.String className, java.lang.String destination, java.lang.String includes) throws IOException {
        throw new InternalError("Stubbed method");
    }

    private static void bootstrapPlugins() {
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
