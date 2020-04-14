package ua.axiom.structural.adapterv2;

public class Adapter {
    private Summator summator;

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = summator.sum(result, a);
        }

        return result;
    }

    public int mod2(int a) {
        return summator.mod2(a);
    }
}
