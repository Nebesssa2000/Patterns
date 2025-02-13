package Behavioural_patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий конкретную коллекцию (список).
 */
class ConcreteCollection<T> implements IterableCollection<T> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
