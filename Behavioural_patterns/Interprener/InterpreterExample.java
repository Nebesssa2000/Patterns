package Behavioural_patterns.Interprener;

import java.util.HashMap;
import java.util.Map;

/**
 * Пример использования паттерна "Интерпретатор" для интерпретации математических выражений.
 */
public class InterpreterExample {
    public static void main(String[] args) {
        // Создание контекста с переменными
        Map<String, Integer> context = new HashMap<>();
        context.put("x", 5);
        context.put("y", 10);

        // Создание выражения: x + y - 3
        Expression expression = new Subtraction(
                new Addition(
                        new Variable("x"),
                        new Variable("y")
                ),
                new Number(3)
        );

        // Интерпретация выражения
        int result = expression.interpret(context);
        System.out.println("Результат: " + result); // Вывод: Результат: 12
    }
}
