package TestUtils;

import io.github.theangrydev.fluentbdd.core.*;

public class AbstractAcceptanceTest implements WithFluentBdd<String> {
    @Override
    public FluentBdd<String> fluentBdd() {
        return null;
    }

    @Override
    public String theResult() {
        return null;
    }

    @Override
    public void given(Given given) {

    }

    @Override
    public <T extends When<String>> void when(T when) {

    }

    @Override
    public <Then> Then then(ThenAssertion<Then, String> thenAssertion) {
        return null;
    }

    @Override
    public void then(ThenVerification<String> thenVerification) {

    }

    @Override
    public void and(Given given) {

    }

    @Override
    public void whenCalling(WhenWithoutResult whenWithoutResult) {

    }

    @Override
    public void given(When<String> when) {

    }

    @Override
    public void and(When<String> when) {

    }

    @Override
    public <Then> Then and(ThenAssertion<Then, String> thenAssertion) {
        return null;
    }

    @Override
    public void and(ThenVerification<String> thenVerification) {

    }
}
