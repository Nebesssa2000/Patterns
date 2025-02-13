package Behavioural_patterns.Mediator;

/**
 * Интерфейс медиатора, определяющий методы для взаимодействия с коллегами.
 */
interface Mediator {
    void notify(Component sender, String event);
}
