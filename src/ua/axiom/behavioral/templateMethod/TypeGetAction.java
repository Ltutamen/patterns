package ua.axiom.behavioral.templateMethod;

public class TypeGetAction implements Template {
    @Override
    public Object action(Object another) {
        return another.getClass();
    }
}
