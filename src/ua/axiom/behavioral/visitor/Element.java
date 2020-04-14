package ua.axiom.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
