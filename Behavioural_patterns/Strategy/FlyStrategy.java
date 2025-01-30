package Behavioural_patterns.Strategy;

/**
 * Конкретная стратегия для передвижения полетом.
 */
class FlyStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Я лечу.");
    }
}
