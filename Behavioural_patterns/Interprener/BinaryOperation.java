package Behavioural_patterns.Interprener;

/**
 * Абстрактный класс для бинарных операций.
 */
abstract class BinaryOperation implements Expression {
    protected Expression left;
    protected Expression right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
