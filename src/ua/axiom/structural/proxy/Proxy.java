package ua.axiom.structural.proxy;

import java.util.Date;

public class Proxy implements Service {
    private Service implementation;
    private boolean isLoggingDone = false;

    public Proxy(Service implementation) {
        this.implementation = implementation;
    }

    @Override
    public void operation() {
        if(!isLoggingDone) {
            System.err.println("logging at " + new Date());
            isLoggingDone = !isLoggingDone;
        }

        implementation.operation();
    }
}
