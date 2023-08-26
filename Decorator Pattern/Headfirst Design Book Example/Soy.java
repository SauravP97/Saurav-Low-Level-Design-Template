package decorator.headfirst;

import decorator.headfirst.CondimentDecorator;
import decorator.headfirst.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;
    private double COST = 0.15;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + COST;
    }
}