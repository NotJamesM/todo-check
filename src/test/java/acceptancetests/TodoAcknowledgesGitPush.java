package acceptancetests;

import TestUtils.AbstractAcceptanceTest;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TodoAcknowledgesGitPush extends AbstractAcceptanceTest {

    @Test
    public void todoRespondsWith204ToAPushAlert() {
        assertThat(whenGitSendsAPushAlertTheResponseStatusCode(), is(204));
    }

    private int whenGitSendsAPushAlertTheResponseStatusCode() {
        return gitSendsAPushAlert().getStatusLine().getStatusCode();
    }
}
