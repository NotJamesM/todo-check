package TestUtils;

import com.github.notjamesm.TodoServer;

public class TestTodoServer {
    public static void main(String[] args) {
        TestTodoServer.start();
    }

    private static TodoServer start() {
        return TodoServer.startServer();
    }
}