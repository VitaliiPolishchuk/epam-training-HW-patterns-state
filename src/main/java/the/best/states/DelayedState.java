package the.best.states;

import the.best.Grant;
import the.best.State;

public class DelayedState implements State {
    Grant grant;

    public DelayedState(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void consider() {
        grant.setState(new ConsideredState(grant));
    }

    @Override
    public void delay() {

    }

    @Override
    public void reject() {
        grant.setState(new RejectedState(grant));
    }

    @Override
    public void confirm() {

    }

    @Override
    public void recall() {
        grant.setState(new RecalledState(grant));
    }
}
