package Structural_pattern.Adapter;

/**
 * Класс с несовместимым интерфейсом, который необходимо адаптировать.
 */
class Adaptee {
    public void specificRequest() {
        System.out.println("Called specificRequest()");
    }
}
