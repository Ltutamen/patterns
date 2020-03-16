package ua.axiom.abstractfabric.fileObjects;

import ua.axiom.abstractfabric.AbstractFactory;
import ua.axiom.abstractfabric.providedObjects.Getter;
import ua.axiom.abstractfabric.providedObjects.Handler;
import ua.axiom.abstractfabric.providedObjects.Provider;
import ua.axiom.abstractfabric.providedObjects.Saver;

public class FileFactory extends AbstractFactory {
    @Override
    public Getter getGetter() {
        return new FileGetter();
    }

    @Override
    public Handler getHandler() {
        return new FileHandler();
    }

    @Override
    public Provider getProvider() {
        return new FileProvider();
    }

    @Override
    public Saver getSaver() {
        return new FileSaver();
    }
}
