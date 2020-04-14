package ua.axiom.behavioral;

import java.util.Deque;
import java.util.List;

public class Interpreter {
    @FunctionalInterface
    public interface Expression {
        int operand(int val1, int val2);
    }

    public static Expression plus = (int v1, int v2) -> v1 + v2;
    public static Expression minus = (int v1, int v2) -> v1 - v2;
    public static Expression multiply = (int v1, int v2) -> v1 * v2;
    public static Expression divide = (int v1, int v2) -> v1 / v2;

    public static int interpret(Deque<Integer> integers, Deque<Expression> expressions) {
        int result = 0;

        for(int i = 0; i < integers.size() && i < expressions.size(); ++i) {
            result = expressions.getFirst().operand(result, integers.getFirst());
        }

        return result;
    }


}
