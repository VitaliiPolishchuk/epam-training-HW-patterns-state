package the.best;

public interface State {
    void consider();
    void delay();
    void reject();
    void confirm();
    void recall();
}
