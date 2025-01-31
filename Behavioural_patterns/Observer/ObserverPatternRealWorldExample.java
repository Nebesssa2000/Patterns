package Behavioural_patterns.Observer;

/**
 * Пример использования паттерна "Наблюдатель".
 */
public class ObserverPatternRealWorldExample {
    public static void main(String[] args) {
        House<String> house = new House<>();

        Observer<String> thermostat = new Thermostat<>("Термостат");
        Observer<String> securitySystem = new SecuritySystem<>("Система безопасности");

        house.addObserver(thermostat);
        house.addObserver(securitySystem);

        house.setState("Температура изменилась на 22°C");

        // Удаляем наблюдателя "Термостат"
        house.removeObserver(thermostat);

        house.setState("Дверь открыта");
    }
}