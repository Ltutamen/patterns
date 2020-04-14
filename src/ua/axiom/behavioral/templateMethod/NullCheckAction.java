package ua.axiom.behavioral.templateMethod;

public class NullCheckAction implements Template {
    @Override
    public Object action(Object another) {
        if(another == null) {
            throw new NullPointerException();
        }

        return another;
    }
}
