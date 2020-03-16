package ua.axiom.abstractfabric.WEBObjects;

import ua.axiom.abstractfabric.AbstractFactory;
import ua.axiom.abstractfabric.providedObjects.Getter;
import ua.axiom.abstractfabric.providedObjects.Handler;
import ua.axiom.abstractfabric.providedObjects.Provider;
import ua.axiom.abstractfabric.providedObjects.Saver;

public class WEBFactory extends AbstractFactory {
    @Override
    public Getter getGetter() {
        return new WEBGetter();
    }

    @Override
    public Handler getHandler() {
        return new WEBHandler();
    }

    @Override
    public Provider getProvider() {
        return new WEBProvider();
    }

    @Override
    public Saver getSaver() {
        return new WEBSaver();
    }
}
