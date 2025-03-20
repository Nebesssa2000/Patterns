package Structural_pattern.Flyweight;

/**
 * Пример использования паттерна "Приспособленец" для управления большим количеством объектов.
 */
public class FlyweightPatternExample {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("First Call");

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("Second Call");

        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation("Third Call");

        System.out.println("Total Flyweights created: " + factory.getFlyweightCount());
    }
}
