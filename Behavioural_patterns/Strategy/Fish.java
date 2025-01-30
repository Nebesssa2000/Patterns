package Behavioural_patterns.Strategy;

/**
 * Класс Рыбы, использующий стратегию плавания.
 */
class Fish extends Animal {
    public Fish() {
        super(new SwimStrategy());
    }
}
