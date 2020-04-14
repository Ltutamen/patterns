package ua.axiom.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Observer {
    private Set<Observable> observables;

    public Observer() {
        this.observables = new HashSet<>();
    }

    public void add(Observable object) {
        observables.add(object);
    }

    public void remove(Observable object) {
        observables.remove(object);
    }

    public void update() {
        observables.forEach(Observable::update);
    }
}
