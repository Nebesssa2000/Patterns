package Behavioural_patterns.Template_Method;

/**
 * Абстрактный класс, представляющий шаблонный метод для приготовления напитка.
 */
abstract class Beverage {
    // Шаблонный метод
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Шаги алгоритма, которые должны быть реализованы в субклассах
    abstract void brew();
    abstract void addCondiments();

    // Общие шаги алгоритма
    void boilWater() {
        System.out.print("Кипячение воды, ");
    }

    void pourInCup() {
        System.out.print("Наливание в чашку, ");
    }
}
