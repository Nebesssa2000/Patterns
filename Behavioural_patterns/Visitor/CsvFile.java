package Behavioural_patterns.Visitor;

/**
 * Класс для CSV файлов.
 */
class CsvFile extends FileSystemElement {
    // Имя файла CSV.
    private final String fileName;

    /**
     * Конструктор для создания CSV файла.
     * @param fileName имя файла CSV.
     */
    public CsvFile(String fileName) {
        this.fileName = fileName; // Инициализация имени файла.
    }

    /**
     * Получить имя файла CSV.
     * @return имя файла CSV.
     */
    public String getFileName() {
        return fileName; // Возвращает имя файла.
    }

    /**
     * Принять визитера.
     * @param visitor визитер.
     */
    @Override
    public void accept(Visitor<? extends FileSystemElement> visitor) {
        visitor.visit(this); // Визитер посещает CSV файл.
    }
}