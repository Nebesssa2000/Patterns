package Behavioural_patterns.Interprener;

import java.util.Map;

/**
 * Класс, представляющий операцию вычитания.
 */
class Subtraction extends BinaryOperation {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
