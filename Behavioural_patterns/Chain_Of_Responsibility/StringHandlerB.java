package Behavioural_patterns.Chain_Of_Responsibility;

/**
 * Конкретный обработчик для запросов типа "String", обрабатывающий запросы "B".
 */
class StringHandlerB extends Handler<String> {
    /**
     * Проверяет, может ли текущий обработчик обработать запрос "B".
     * @param request запрос на обработку
     * @return true, если запрос равен "B", иначе false
     */
    @Override
    protected boolean canHandle(String request) {
        return "B".equals(request);
    }

    /**
     * Обрабатывает запрос "B".
     * @param request запрос на обработку
     */
    @Override
    protected void processRequest(String request) {
        System.out.println("Handler B processed request: " + request);
    }
}
