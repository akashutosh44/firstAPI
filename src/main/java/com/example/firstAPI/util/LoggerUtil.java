package com.example.firstAPI.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerUtil {

    private static LoggerUtil instance;

    // Private constructor to prevent instantiation
    private LoggerUtil() {}

    // Static method to get the single instance of LoggerUtil
    public static LoggerUtil getInstance() {
        if (instance == null) {
            synchronized (LoggerUtil.class) {
                if (instance == null) {
                    instance = new LoggerUtil();
                }
            }
        }
        return instance;
    }

    // Generic method to return logger for a specific class
    public Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }

    // Example of utility method for logging info
    public void logInfo(Class<?> clazz, String message) {
        Logger logger = getLogger(clazz);
        logger.info(message);
    }

    // Example of utility method for logging debug
    public void logDebug(Class<?> clazz, String message) {
        Logger logger = getLogger(clazz);
        logger.debug(message);
    }

    // Example of utility method for logging errors
    public void logError(Class<?> clazz, String message, Throwable ex) {
        Logger logger = getLogger(clazz);
        logger.error(message, ex);
    }

}
