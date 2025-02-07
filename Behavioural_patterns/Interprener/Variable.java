package Behavioural_patterns.Interprener;

import java.util.Map;

/**
 * Класс, представляющий переменное выражение.
 */
class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        if (context.containsKey(name)) {
            return context.get(name);
        }
        throw new RuntimeException("Неизвестная переменная: " + name);
    }
}

