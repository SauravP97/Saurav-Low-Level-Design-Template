package decorator.headfirst;

import decorator.headfirst.CondimentDecorator;
import decorator.headfirst.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    private double COST = 0.20;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + COST;
    }
}