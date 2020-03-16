package ua.axiom.prototype;

public class AClass implements Cloneable {
    public int a;
    public int b;

    public AClass(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException cnso) {
            cnso.printStackTrace();
            throw new RuntimeException();
        }
    }
}
