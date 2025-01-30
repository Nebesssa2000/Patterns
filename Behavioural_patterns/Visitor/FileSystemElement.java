package Behavioural_patterns.Visitor;

/**
 * Абстрактный класс для элементов файловой системы.
 */
public abstract class FileSystemElement {
    /**
     * Метод для принятия визитера.
     * @param visitor визитер.
     */
    public abstract void accept(Visitor<? extends FileSystemElement> visitor);
}