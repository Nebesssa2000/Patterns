package Structural_pattern.Adapter;

/**
 * Класс, который реализует интерфейс Target и оборачивает объект Adaptee.
 */
class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
