package Behavioural_patterns.Template_Method;

/**
 * Класс, представляющий приготовление кофе.
 */
class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.print("Заваривание кофе, ");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавление сахара и молока");
    }
}
