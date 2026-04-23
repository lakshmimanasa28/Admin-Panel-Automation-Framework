package com.adminpanel.utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input == null) {
                throw new RuntimeException("config.properties NOT FOUND in resources");
            }

            prop.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Unable to load config.properties", e);
        }
    }

    public static String getBrowser() {
        return prop.getProperty("browser");
    }

    public static String getBaseUrl() {
        return prop.getProperty("baseUrl");
    }

    public static int getTimeout() {
        return Integer.parseInt(prop.getProperty("timeout"));
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(prop.getProperty("headless", "false"));
    }

    // ✅ FIXED METHOD
    public static String get(String key) {
        return prop.getProperty(key);
    }
}