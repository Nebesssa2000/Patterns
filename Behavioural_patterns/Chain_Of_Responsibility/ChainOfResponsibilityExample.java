package Behavioural_patterns.Chain_Of_Responsibility;

/**
 * Пример использования паттерна "Цепочка обязанностей".
 */
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Создаем обработчики
        Handler<String> handlerA = new StringHandlerA();
        Handler<String> handlerB = new StringHandlerB();

        // Устанавливаем цепочку обработчиков
        handlerA.setNextHandler(handlerB);

        // Обрабатываем запросы
        handlerA.handleRequest("A"); // Обрабатывается обработчиком A
        handlerA.handleRequest("B"); // Обрабатывается обработчиком B
        handlerA.handleRequest("C"); // Не обрабатывается ни одним обработчиком
    }
}
