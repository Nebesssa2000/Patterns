package Behavioural_patterns.Observer;

/**
 * Интерфейс наблюдателя, определяющий метод для получения уведомлений.
 */
interface Observer<T> {
    void update(T message);
}
