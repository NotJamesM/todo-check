package TestUtils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

class TestHttpClient {

    private final CloseableHttpClient client;

    public TestHttpClient() {
        this.client = HttpClientBuilder.create().build();
    }

    public CloseableHttpResponse doJsonPost(String jsonContent) throws IOException {
        StringEntity entity = new StringEntity(jsonContent, ContentType.APPLICATION_JSON);
        HttpPost post = new HttpPost(TestTodoServer.TEST_URL);
        post.setEntity(entity);
        return client.execute(post);
    }

}
