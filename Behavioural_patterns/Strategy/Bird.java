package Behavioural_patterns.Strategy;

/**
 * Класс Птицы, использующий стратегию полета.
 */
class Bird extends Animal {
    public Bird() {
        super(new FlyStrategy());
    }
}
