package com.team.git.practice.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    static final Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream("src/main/resources/configuration.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("configuration.properties file not found or could not be loaded.", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
