package Behavioural_patterns.Chain_Of_Responsibility;

/**
 * Абстрактный класс для обработчиков.
 * @param <T> тип обрабатываемого запроса
 */
abstract class Handler<T> {
    // Следующий обработчик в цепочке
    private Handler<T> nextHandler;

    /**
     * Устанавливает следующий обработчик в цепочке.
     * @param nextHandler следующий обработчик
     */
    public void setNextHandler(Handler<T> nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Обрабатывает запрос или передает его следующему обработчику.
     * @param request запрос на обработку
     */
    public void handleRequest(T request) {
        // Проверяем, может ли текущий обработчик обработать запрос
        if (canHandle(request)) {
            // Обрабатываем запрос
            processRequest(request);
        } else if (nextHandler != null) {
            // Передаем запрос следующему обработчику в цепочке
            nextHandler.handleRequest(request);
        }
    }

    /**
     * Проверяет, может ли текущий обработчик обработать запрос.
     * @param request запрос на обработку
     * @return true, если обработчик может обработать запрос, иначе false
     */
    protected abstract boolean canHandle(T request);

    /**
     * Обрабатывает запрос.
     * @param request запрос на обработку
     */
    protected abstract void processRequest(T request);
}