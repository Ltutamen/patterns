package ua.axiom.fabricmethod;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.InvocationTargetException;

public abstract class Operation {
    public static Operation getInstance(Class<? extends  Operation> c) {
        try {
            return (Operation)c.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException nsme) {
            nsme.printStackTrace();
            throw new RuntimeException();
        }
    }
}
