package Structural_pattern.Proxy;

/**
 * Пример использования паттерна "Заместитель" для контроля доступа к реальному объекту.
 */
public class ProxyExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Изображение будет загружено с диска и отображено
        image.display();

        // Изображение не будет загружено с диска повторно, будет использован кэшированный объект
        image.display();
    }
}
