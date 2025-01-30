package Behavioural_patterns.Strategy;

/**
 * Абстрактный класс животного, использующий стратегию передвижения.
 */
abstract class Animal {
    protected MovementStrategy movementStrategy;

    public Animal(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    /**
     * Выполняет стратегию передвижения.
     */
    public void move() {
        movementStrategy.move();
    }
}
