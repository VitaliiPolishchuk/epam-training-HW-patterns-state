package the.best.states;

import the.best.Grant;
import the.best.State;

public class RejectedState implements State {
    Grant grant;

    public RejectedState(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void consider() {

    }

    @Override
    public void delay() {

    }

    @Override
    public void reject() {

    }

    @Override
    public void confirm() {

    }

    @Override
    public void recall() {

    }
}
