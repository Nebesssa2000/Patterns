package Momento;

/**
 * Класс, представляющий состояние текстового редактора.
 */
class EditorState {
    private String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
