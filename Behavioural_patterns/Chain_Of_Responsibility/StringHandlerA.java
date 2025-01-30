package Behavioural_patterns.Chain_Of_Responsibility;

/**
 * Конкретный обработчик для запросов типа "String", обрабатывающий запросы "A".
 */
class StringHandlerA extends Handler<String> {
    /**
     * Проверяет, может ли текущий обработчик обработать запрос "A".
     * @param request запрос на обработку
     * @return true, если запрос равен "A", иначе false
     */
    @Override
    protected boolean canHandle(String request) {
        return "A".equals(request);
    }

    /**
     * Обрабатывает запрос "A".
     * @param request запрос на обработку
     */
    @Override
    protected void processRequest(String request) {
        System.out.println("Handler A processed request: " + request);
    }
}