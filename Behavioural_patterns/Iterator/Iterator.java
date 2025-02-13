package Behavioural_patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Интерфейс итератора, определяющий методы для обхода коллекции.
 */
interface Iterator<T> {
    boolean hasNext();
    T next();
}
