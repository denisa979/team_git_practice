package com.team.git.practice.utilities;

import java.util.Properties;

public class ConfigurationReader {

    public static final Properties properties = new Properties();

    static {
        try {
            properties.load(
                    ConfigurationReader.class
                            .getClassLoader()
                            .getResourceAsStream("configuration.properties")
            );
        } catch (Exception e) {
            throw new RuntimeException(
                    "configuration.properties file not found or could not be loaded.", e
            );
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
