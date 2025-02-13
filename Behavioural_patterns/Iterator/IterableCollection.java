package Behavioural_patterns.Iterator;

/**
 * Интерфейс коллекции, предоставляющий метод для создания итератора.
 */
interface IterableCollection<T> {
    Iterator<T> createIterator();
}
