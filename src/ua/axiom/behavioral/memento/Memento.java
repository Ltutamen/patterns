package ua.axiom.behavioral.memento;

public class  Memento <T extends Memorable> {
    private Memorable snapshot;

    public Memento(T object) {
        snapshot = object.clone();
    }

    public T getSnapshot() {
        return (T)snapshot.clone();
    }
}
