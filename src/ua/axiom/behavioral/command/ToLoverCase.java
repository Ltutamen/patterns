package ua.axiom.behavioral.command;

public class ToLoverCase implements Command<SomeObject> {
    private SomeObject object;

    public ToLoverCase(SomeObject object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.setData(object.getData().toLowerCase());
    }
}
