package org.wso2.choreo.connect.enforcer.jmx;

/**
 * JMX Utilities
 */
public class JMXUtils {

    private static final String CHOREO_CONNECT_JMX_METRICS_ENABLE = "choreo.connect.jmx.metrics.enable";

    /**
     * Returns true if jmx metrics enabled as a system property, otherwise false.
     * 
     * @return boolean
     */
    public static boolean isJMXMetricsEnabled() {
        return Boolean.getBoolean(CHOREO_CONNECT_JMX_METRICS_ENABLE);
    }
}
