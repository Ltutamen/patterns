package ua.axiom.behavioral.mediator;

public class Mediator {
    public void hello(Head head, Legs legs) {
        System.out.println(head.getOwnerName() + " runs on legs on speed " + legs.getSped());
    }

}
