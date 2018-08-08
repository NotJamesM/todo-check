package com.github.notjamesm;

import org.apache.log4j.Logger;

public class TodoServer {

    private static final int DEFAULT_PORT_NUMBER = 8080;
    private static final Logger LOGGER = Logger.getRootLogger();

    public static void main(String[] args) {
        TodoJettySever server = new TodoJettySever(DEFAULT_PORT_NUMBER);
        server.start();
        LOGGER.info("Started server");
        Runtime.getRuntime().addShutdownHook(new Thread(server::stop));
    }
}
