package Behavioural_patterns.Mediator;

/**
 * Пример использования паттерна "Медиатор" для управления взаимодействием между компонентами пользовательского интерфейса.
 */
public class MediatorExample {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Button button = new Button(mediator);
        TextBox textBox = new TextBox(mediator);

        mediator.addComponent(button);
        mediator.addComponent(textBox);

        button.click();
        textBox.triggerEvent("setText");
    }
}
