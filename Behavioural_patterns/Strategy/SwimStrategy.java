package Behavioural_patterns.Strategy;

/**
 * Конкретная стратегия для передвижения плаванием.
 */
class SwimStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Я плыву.");
    }
}
