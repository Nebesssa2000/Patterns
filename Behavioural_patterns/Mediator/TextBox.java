package Behavioural_patterns.Mediator;

/**
 * Конкретный класс компонента текстового поля.
 */
class TextBox extends Component {
    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        System.out.println("TextBox text set to: " + text);
    }

    @Override
    public void triggerEvent(String event) {
        if (event.equals("setText")) {
            setText("New Text");
        }
    }
}
