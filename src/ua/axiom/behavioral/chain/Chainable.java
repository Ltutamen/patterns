package ua.axiom.behavioral.chain;

import java.util.function.Consumer;

public interface Chainable<T> {
    Chainable<T> thenPassTo(Consumer<T> con);
}
