package Behavioural_patterns.State;

/**
 * Класс, представляющий конкретное состояние "Выключено".
 */
class OffState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Состояние: Выключено");
    }
}
