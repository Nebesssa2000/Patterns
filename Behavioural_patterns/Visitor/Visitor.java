package Behavioural_patterns.Visitor;

/**
 * Интерфейс визитера.
 * @param <T> тип элемента файловой системы, который будет посещаться.
 */
public interface Visitor<T extends FileSystemElement> {
    /**
     * Метод для посещения текстового файла.
     * @param textFile текстовый файл.
     */
    void visit(TextFile textFile);

    /**
     * Метод для посещения изображения.
     * @param imageFile изображение.
     */
    void visit(ImageFile imageFile);

    /**
     * Метод для посещения CSV файла.
     * @param csvFile CSV файл.
     */
    void visit(CsvFile csvFile);
}