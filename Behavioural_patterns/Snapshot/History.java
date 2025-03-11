package Behavioural_patterns.Snapshot;

import java.util.Stack;

/**
 * Класс, управляющий сохранением и восстановлением состояний текстового редактора.
 */
class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}

