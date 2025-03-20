package Structural_pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Фабрика, которая создает и управляет объектами Flyweight.
 */
class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }

    public int getFlyweightCount() {
        return flyweights.size();
    }
}