package Behavioural_patterns.Visitor;

/**
 * Класс для текстовых файлов.
 */
class TextFile extends FileSystemElement {
    // Содержимое текстового файла.
    private String content;

    /**
     * Конструктор для создания текстового файла.
     * @param content содержимое текстового файла.
     */
    public TextFile(String content) {
        this.content = content; // Инициализация содержимого.
    }

    /**
     * Получить содержимое текстового файла.
     * @return содержимое текстового файла.
     */
    public String getContent() {
        return content; // Возвращает содержимое.
    }

    /**
     * Принять визитера.
     * @param visitor визитер.
     */
    @Override
    public void accept(Visitor<? extends FileSystemElement> visitor) {
        visitor.visit(this); // Визитер посещает текстовый файл.
    }
}