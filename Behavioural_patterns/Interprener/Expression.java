package Behavioural_patterns.Interprener;

import java.util.Map;

/**
 * Интерфейс выражения, определяющий метод интерпретации.
 */
interface Expression {
    int interpret(Map<String, Integer> context);
}
