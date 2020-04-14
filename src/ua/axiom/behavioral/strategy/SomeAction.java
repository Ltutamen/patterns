package ua.axiom.behavioral.strategy;

public class SomeAction {
    public static void act() {
        Strategy strategy = Strategy.add;
        int result = 54;

        for(int i = 0; i < 5; ++i) {
            result = strategy.doOperation(result, 5);
        }

        strategy = Strategy.mult;

        for (int i = 5; i > 0; --i) {
            result = strategy.doOperation(result, 7);
        }
    }
}
