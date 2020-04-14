package ua.axiom.structural.facade;

public class Facade {
    private ComplexClass1 class1;
    private ComplexClass2 class2;
    private ComplexClass3 class3;

    public String getTheJobDone(String s) {
        return s + class1.getSomething() + class3.getSomething() + s;
    }

}
