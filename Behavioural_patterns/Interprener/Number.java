package Behavioural_patterns.Interprener;

import java.util.Map;

/**
 * Класс, представляющий числовое выражение.
 */
class Number implements Expression {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return number;
    }
}
