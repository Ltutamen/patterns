package ua.axiom.behavioral.memento;

public class SomeClass implements Memorable {
    private String state;
    private Integer moreState;

    public SomeClass(String state, Integer moreState) {
        this.state = state;
        this.moreState = moreState;
    }

    @Override
    public Memorable clone() {
        return new SomeClass(new String(state), new Integer(moreState));
    }
}
