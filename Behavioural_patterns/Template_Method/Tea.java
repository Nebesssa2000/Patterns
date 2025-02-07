package Behavioural_patterns.Template_Method;

/**
 * Класс, представляющий приготовление чая.
 */
class Tea extends Beverage {
    @Override
    void brew() {
        System.out.print("Заваривание чая, ");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавление лимона");
    }
}
