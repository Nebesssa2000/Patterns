package Behavioural_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретный субъект, представляющий дом.
 */
class House<T> implements Subject<T> {
    private final List<Observer<T>> observers = new ArrayList<>();
    private T state;

    @Override
    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<T> observer : observers) {
            observer.update(state);
        }
    }

    public void setState(T state) {
        this.state = state;
        notifyObservers();
    }
}