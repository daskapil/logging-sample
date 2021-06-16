package com.kapil.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private final static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
        LOGGER.debug("Debugging the code");
        LOGGER.warn("Logging warning");
        LOGGER.error("Logging error");
        LOGGER.trace("Logging trace"); // Won't log the trace.Set the log level in log42.xml to log trace
    }
}
