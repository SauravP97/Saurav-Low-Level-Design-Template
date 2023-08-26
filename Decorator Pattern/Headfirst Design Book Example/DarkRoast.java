package decorator.headfirst;

import decorator.headfirst.Beverage;

public class DarkRoast extends Beverage {
    private double COST = 0.99;

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return COST;
    }
}