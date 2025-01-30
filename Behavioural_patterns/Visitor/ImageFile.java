package Behavioural_patterns.Visitor;

/**
 * Класс для изображений.
 */
class ImageFile extends FileSystemElement {
    // Путь к изображению.
    private String path;

    /**
     * Конструктор для создания изображения.
     * @param path путь к изображению.
     */
    public ImageFile(String path) {
        this.path = path; // Инициализация пути.
    }

    /**
     * Получить путь к изображению.
     * @return путь к изображению.
     */
    public String getPath() {
        return path; // Возвращает путь.
    }

    /**
     * Принять визитера.
     * @param visitor визитер.
     */
    @Override
    public void accept(Visitor<? extends FileSystemElement> visitor) {
        visitor.visit(this); // Визитер посещает изображение.
    }
}