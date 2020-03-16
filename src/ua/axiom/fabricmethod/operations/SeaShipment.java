package ua.axiom.fabricmethod.operations;

import ua.axiom.fabricmethod.Operation;

public class SeaShipment extends Operation {
    protected SeaShipment() {
        System.out.println("SeaShipment");
    }

    public static Operation getInstance() {
        return new SeaShipment();
    }
}
