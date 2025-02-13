package Behavioural_patterns.Mediator;

/**
 * Абстрактный класс компонента, который взаимодействует с медиатором.
 */
abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void triggerEvent(String event);
}
