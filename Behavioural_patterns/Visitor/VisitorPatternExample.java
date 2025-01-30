package Behavioural_patterns.Visitor;

/**
 * Пример использования паттерна Визитер.
 */
public class VisitorPatternExample {
    /**
     * Главный метод программы.
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        // Массив элементов файловой системы.
        FileSystemElement[] elements = {
                new TextFile("Hello World"), // Создание текстового файла.
                new ImageFile("/path/to/image.png"), // Создание изображения.
                new CsvFile("payload") // Создание CSV файла.
        };

        // Создание визитера для отображения информации о файлах.
        Visitor<FileSystemElement> fileInfoVisitor = new FileInfoVisitor();

        // Применение визитера ко всем элементам файловой системы.
        for (FileSystemElement element : elements) {
            element.accept(fileInfoVisitor); // Принятие визитера элементом.
        }
    }
}