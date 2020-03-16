package ua.axiom.fabricmethod.operations;

import ua.axiom.fabricmethod.Operation;

public class AutoShipment extends Operation {
    private AutoShipment() {
        System.out.println("AutoShipment");
    }

    public static Operation getInstance() {
        return new AutoShipment();
    }
}
