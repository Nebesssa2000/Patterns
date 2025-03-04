package Behavioural_patterns.Momento;

import java.util.Stack;

/**
 * Класс, управляющий сохранением и восстановлением состояний текстового редактора.
 */
class History {
    private final Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
