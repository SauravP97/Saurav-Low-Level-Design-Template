package decorator.headfirst;

import decorator.headfirst.Beverage;

public class Espresso extends Beverage {
    private double COST = 1.99;

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return COST;
    }
}