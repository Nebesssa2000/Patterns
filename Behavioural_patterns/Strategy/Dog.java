package Behavioural_patterns.Strategy;

/**
 * Класс Собаки, использующий стратегию ходьбы.
 */
class Dog extends Animal {
    public Dog() {
        super(new WalkStrategy());
    }
}
