package Behavioural_patterns.Snapshot;

/**
 * Пример использования паттерна "Снимок" для сохранения и восстановления состояния текстового редактора.
 */
public class SnapshotExample {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Version 1");
        history.push(editor.save());

        editor.setContent("Version 2");
        history.push(editor.save());

        editor.setContent("Version 3");
        System.out.println("Current Content: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());
    }
}
