package ua.axiom.behavioral.chain;

import java.util.function.Consumer;

public class Logging implements Chainable<Logging> {
    @Override
    public Chainable<Logging> thenPassTo(Consumer<Logging> con) {
        con.accept(this);
        return this;
    }
}
