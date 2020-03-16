package ua.axiom;

import ua.axiom.abstractfabric.AbstractFactory;
import ua.axiom.abstractfabric.WEBObjects.WEBFactory;
import ua.axiom.abstractfabric.fileObjects.FileFactory;
import ua.axiom.builder.FunnyClass;
import ua.axiom.fabricmethod.Operation;
import ua.axiom.fabricmethod.operations.AutoShipment;
import ua.axiom.fabricmethod.operations.SeaShipment;
import ua.axiom.prototype.AClass;

public class Main {

    public static void main(String[] args) {
	    webFactory();
	    fileFactory();

	    factoryMethod();

        builder();

        prototype();
    }

    private static void prototype() {
        AClass aClass = new AClass(10, 12);
        AClass bClass = (AClass)aClass.clone();

        assert bClass.b == aClass.a;
        assert bClass.a == aClass.a;
    }

    private static void builder() {
        FunnyClass fc = new FunnyClass.FunnyClassBuilder().setAge(99).setPrice(1234.55F).setName("Donny").build();
        assert fc.age == 99;
        System.out.println(fc.getName());
    }

    private static void factoryMethod() {
        Operation sea = Operation.getInstance(SeaShipment.class);
        Operation aut = Operation.getInstance(AutoShipment.class);
    }

    private static void webFactory() {
        AbstractFactory factory = new WEBFactory();
        System.out.println("WEb Factory provided:");
        System.out.println(factory.getGetter());
        System.out.println(factory.getProvider());
    }

    private static void fileFactory() {
        AbstractFactory factory = new FileFactory();
        System.out.println("File Factory provided:");
        System.out.println(factory.getGetter());
        System.out.println(factory.getProvider());
    }
}
