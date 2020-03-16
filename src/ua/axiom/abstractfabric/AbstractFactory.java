package ua.axiom.abstractfabric;

import ua.axiom.abstractfabric.providedObjects.Getter;
import ua.axiom.abstractfabric.providedObjects.Handler;
import ua.axiom.abstractfabric.providedObjects.Provider;
import ua.axiom.abstractfabric.providedObjects.Saver;

public abstract class AbstractFactory {
    public abstract Getter getGetter();
    public abstract Handler getHandler();
    public abstract Provider getProvider();
    public abstract Saver getSaver();
}
