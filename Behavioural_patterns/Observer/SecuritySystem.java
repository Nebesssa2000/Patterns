package Behavioural_patterns.Observer;

/**
 * Конкретный наблюдатель, представляющий систему безопасности.
 */
class SecuritySystem<T> implements Observer<T> {
    private final String name;

    public SecuritySystem(String name) {
        this.name = name;
    }

    @Override
    public void update(T message) {
        // if (message instanceof String && ((String) message).contains("Дверь")) { можно добавить логику фильтрации сообщений
            System.out.println(name + " получил уведомление: " + message);
        // }
    }
}