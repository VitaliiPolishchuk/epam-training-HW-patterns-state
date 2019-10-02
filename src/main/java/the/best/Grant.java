package the.best;

import the.best.states.ConfirmedState;
import the.best.states.CreatedState;

public class Grant {

    private State state;
    private String name;

    public Grant(String name) {
        this.name = name;
        this.state = new CreatedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void consider(){
        state.consider();
    }

    public void delay(){
        state.delay();
    }

    public void reject(){
        state.reject();
    }

    public void confirm(){
        state.confirm();
    }

    public void recall(){
        state.recall();
    }

    public boolean isConfirmed(){
        return state instanceof ConfirmedState;
    }

    public String getName() {
        return name;
    }
}
