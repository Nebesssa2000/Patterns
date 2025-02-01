package Behavioural_patterns.Command;

/**
 * Пример использования паттерна "Команда".
 */
public class CommandPatternRealWorldExample {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLight = new TurnOffLightCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Включаем свет
        remote.setCommand(turnOnLight);
        remote.pressButton();

        // Выключаем свет
        remote.setCommand(turnOffLight);
        remote.pressButton();
    }
}
