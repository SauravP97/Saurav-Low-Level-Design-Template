package decorator.headfirst;

import decorator.headfirst.CondimentDecorator;
import decorator.headfirst.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;
    private double COST = 0.10;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + COST;
    }
}