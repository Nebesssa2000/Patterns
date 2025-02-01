package Behavioural_patterns.Command;

/**
 * Конкретная команда для выключения света.
 */
class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
