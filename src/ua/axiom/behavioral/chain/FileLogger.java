package ua.axiom.behavioral.chain;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.function.Consumer;

public class FileLogger implements Consumer<Logging> {
    @Override
    public Consumer<Logging> andThen(Consumer<? super Logging> consumer) {
        throw new NotImplementedException();

    }

    @Override
    public void accept(Logging s) {
        System.out.println("logged to file " + s);
    }
}
