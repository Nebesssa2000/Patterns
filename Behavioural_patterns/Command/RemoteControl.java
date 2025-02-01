package Behavioural_patterns.Command;

/**
 * Класс, представляющий пульт дистанционного управления.
 */
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
