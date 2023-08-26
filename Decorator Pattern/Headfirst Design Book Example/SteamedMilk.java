package decorator.headfirst;

import decorator.headfirst.CondimentDecorator;
import decorator.headfirst.Beverage;

public class SteamedMilk extends CondimentDecorator {
    private Beverage beverage;
    private double COST = 0.10;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return beverage.cost() + COST;
    }
}