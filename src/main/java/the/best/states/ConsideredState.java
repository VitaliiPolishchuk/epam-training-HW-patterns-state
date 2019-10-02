package the.best.states;

import the.best.Grant;
import the.best.State;

public class ConsideredState implements State {
    Grant grant;

    public ConsideredState(Grant grant) {
        this.grant = grant;
    }

    @Override
    public void consider() {

    }

    @Override
    public void delay() {
        grant.setState(new DelayedState(grant));
    }

    @Override
    public void reject() {
        grant.setState(new RejectedState(grant));
    }

    @Override
    public void confirm() {
        grant.setState(new ConfirmedState(grant));
    }

    @Override
    public void recall() {
        grant.setState(new RecalledState(grant));
    }
}
