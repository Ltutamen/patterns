package ua.axiom.behavioral.strategy;

public interface Strategy {
    int doOperation(int i1, int i2);

    Strategy add = (int i1, int i2) -> i1 + i2;
    Strategy sub = (int i1, int i2) -> i1 - i2;
    Strategy mult = (int i1, int i2) -> i1 * i2;
    Strategy div = (int i1, int i2) -> i1 / i2;

}
