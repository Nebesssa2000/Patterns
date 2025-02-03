package Behavioural_patterns.State;

/**
 * Класс, представляющий конкретное состояние "Включено".
 */
class OnState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Состояние: Включено");
    }
}
