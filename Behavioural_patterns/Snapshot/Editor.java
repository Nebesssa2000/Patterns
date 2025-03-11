package Behavioural_patterns.Snapshot;

/**
 * Класс, представляющий текстовый редактор.
 */
class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorState save() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.content();
    }
}

