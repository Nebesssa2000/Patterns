package Behavioural_patterns.Strategy;

/**
 * Конкретная стратегия для передвижения на лапах.
 */
class WalkStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Я иду на лапах.");
    }
}
