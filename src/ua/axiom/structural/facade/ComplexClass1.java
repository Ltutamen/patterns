package ua.axiom.structural.facade;

public class ComplexClass1 {
    private ComplexClass2 class2;


    public String getSomething() {
        return "aa" + class2.getSomething();
    }

    public String getFoo() {
        return "bb" + getSomething();
    }
}
