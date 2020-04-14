package ua.axiom.behavioral.iterator;

public interface Iterable<T> {
    Iterable<T> next();

    boolean hasNext();

    T get();

}
