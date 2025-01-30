package Behavioural_patterns.Strategy;

/**
 * Пример использования паттерна "Стратегия".
 */
public class StrategyPatternExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.move(); // Вывод: Я иду на лапах.

        Animal bird = new Bird();
        bird.move(); // Вывод: Я лечу.

        Animal fish = new Fish();
        fish.move(); // Вывод: Я плыву.
    }
}
