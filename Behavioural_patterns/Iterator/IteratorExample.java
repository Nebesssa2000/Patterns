package Behavioural_patterns.Iterator;

/**
 * Пример использования паттерна "Итератор" для обхода элементов списка.
 */
public class IteratorExample {
    public static void main(String[] args) {
        ConcreteCollection<String> collection = new ConcreteCollection<>();
        collection.addItem("Элемент 1");
        collection.addItem("Элемент 2");
        collection.addItem("Элемент 3");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
