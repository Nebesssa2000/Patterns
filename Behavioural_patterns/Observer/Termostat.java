package Behavioural_patterns.Observer;

/**
 * Конкретный наблюдатель, представляющий термостат.
 */
class Thermostat<T> implements Observer<T> {
    private final String name;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void update(T message) {
        // if (message instanceof String && ((String) message).contains("Температура")) { можно добавить логику фильтрации сообщений
            System.out.println(name + " получил уведомление: " + message);
        // }
    }
}