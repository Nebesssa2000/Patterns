package Behavioural_patterns.Template_Method;

/**
 * Пример использования паттерна "Шаблонный метод".
 */
public class TemplateMethodExample {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe(); // Вывод: Кипячение воды, Заваривание чая, Наливание в чашку, Добавление лимона

        Beverage coffee = new Coffee();
        coffee.prepareRecipe(); // Вывод: Кипячение воды, Заваривание кофе, Наливание в чашку, Добавление сахара и молока

        Beverage soap = new Soap();
        soap.prepareRecipe(); // Вывод: Кипячение воды, Нарезка и варка мяса и овощей, Наливание в чашку, Добавление специй
    }
}
