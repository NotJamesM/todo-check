package com.github.notjamesm;

import org.apache.log4j.Logger;

public class TodoServer {

    private static final int DEFAULT_PORT_NUMBER = 8080;
    private static final Logger LOGGER = Logger.getLogger(TodoServer.class);
    private static final TodoJettySever server = new TodoJettySever(DEFAULT_PORT_NUMBER);

    public static void main(String[] args) {
        server.start();
        LOGGER.info("Started server");
        Runtime.getRuntime().addShutdownHook(new Thread(server::stop));
    }

    public static void startServer(){
        server.start();
    }

    public static void stopServer(){
        server.stop();
    }
}
