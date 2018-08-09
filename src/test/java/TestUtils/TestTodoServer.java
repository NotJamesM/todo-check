package TestUtils;

import com.github.notjamesm.TodoServer;

public class TestTodoServer {

    public static final String TEST_URL = "http://localhost:8080/todo/";

    public static void main(String[] args) {
        TestTodoServer.start();
    }

    public static void start() {
        TodoServer.startServer();
    }

    public static void stop() {
        TodoServer.stopServer();
    }
}