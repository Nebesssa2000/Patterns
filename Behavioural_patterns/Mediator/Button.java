package Behavioural_patterns.Mediator;

/**
 * Конкретный класс компонента кнопки.
 */
class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        System.out.println("Button clicked");
        mediator.notify(this, "click");
    }

    @Override
    public void triggerEvent(String event) {
        if (event.equals("click")) {
            click();
        }
    }
}
