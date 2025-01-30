package Behavioural_patterns.Visitor;

/**
 * Визитер для отображения информации о файлах.
 */
public class FileInfoVisitor implements Visitor<FileSystemElement> {
    /**
     * Метод для посещения текстового файла.
     * @param textFile текстовый файл.
     */
    @Override
    public void visit(TextFile textFile) {
        // Вывод информации о текстовом файле.
        System.out.println("Text file with content: " + textFile.getContent());
    }

    /**
     * Метод для посещения изображения.
     * @param imageFile изображение.
     */
    @Override
    public void visit(ImageFile imageFile) {
        // Вывод информации об изображении.
        System.out.println("Image file with path: " + imageFile.getPath());
    }

    /**
     * Метод для посещения CSV файла.
     * @param csvFile CSV файл.
     */
    @Override
    public void visit(CsvFile csvFile) {
        // Вывод информации о CSV файле.
        System.out.println("CSV file with filename: " + csvFile.getFileName());
    }
}