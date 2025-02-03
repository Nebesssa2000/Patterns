package Behavioural_patterns.State;

/**
 * Пример использования паттерна "Состояние".
 */
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        State onState = new OnState();
        State offState = new OffState();

        context.setState(onState);
        context.request(); // Вывод: Состояние: Включено

        context.setState(offState);
        context.request(); // Вывод: Состояние: Выключено
    }
}
