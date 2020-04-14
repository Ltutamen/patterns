package ua.axiom.behavioral.command;

class ToUpperCase implements Command<SomeObject> {
    private final SomeObject object;

    public ToUpperCase(SomeObject object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.setData(object.getData().toUpperCase());
    }
}
