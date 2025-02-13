package Behavioural_patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретный класс медиатора, управляющий взаимодействием между компонентами.
 */
class ConcreteMediator implements Mediator {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void notify(Component sender, String event) {
        for (Component component : components) {
            if (component != sender) {
                component.triggerEvent(event);
            }
        }
    }
}
