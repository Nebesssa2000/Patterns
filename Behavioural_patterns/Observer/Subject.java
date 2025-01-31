package Behavioural_patterns.Observer;

/**
 * Интерфейс субъекта, определяющий методы для добавления, удаления и уведомления наблюдателей.
 */
interface Subject<T> {
    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers();
}