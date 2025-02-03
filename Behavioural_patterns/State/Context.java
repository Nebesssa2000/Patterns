package Behavioural_patterns.State;

/**
 * Класс, представляющий контекст, который может изменять свое состояние.
 */
class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
