package Behavioural_patterns.Iterator;

import java.util.List;

/**
 * Класс, представляющий конкретный итератор для списка.
 */
class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}