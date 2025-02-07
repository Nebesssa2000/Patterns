package Behavioural_patterns.Template_Method;

public class Soap extends Beverage {
    @Override
    void brew() {
        System.out.print("Варка мяса и овощей, ");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавление сметаны и сухариков");
    }
}
