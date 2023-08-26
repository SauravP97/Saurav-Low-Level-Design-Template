package decorator.headfirst;

import decorator.headfirst.Beverage;

public class HouseBlend extends Beverage {
    private double COST = 0.89;

    public HouseBlend() {
        description = "House Blend";
    }

    public double cost() {
        return COST;
    }
}