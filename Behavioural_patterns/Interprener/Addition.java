package Behavioural_patterns.Interprener;

import java.util.Map;

/**
 * Класс, представляющий операцию сложения.
 */
class Addition extends BinaryOperation {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
