package TestUtils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public abstract class AbstractAcceptanceTest  {

    private static final TestHttpClient HTTP_CLIENT = new TestHttpClient();

    protected CloseableHttpResponse gitSendsAPushAlert() {
        try (CloseableHttpResponse some_stuff = HTTP_CLIENT.doJsonPost("some stuff")) {
            return some_stuff;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Before
    public void setUp(){
        TestTodoServer.start();
    }

    @After
    public void tearDown(){
        TestTodoServer.stop();
    }
}
