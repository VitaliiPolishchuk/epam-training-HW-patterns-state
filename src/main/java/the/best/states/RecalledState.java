package the.best.states;

import the.best.Grant;
import the.best.State;

public class RecalledState implements State {
    Grant grant;

    public RecalledState(Grant grant) {
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
