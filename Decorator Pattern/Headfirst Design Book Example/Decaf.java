package decorator.headfirst;

import decorator.headfirst.Beverage;

public class Decaf extends Beverage {
    private double COST = 1.05;

    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return COST;
    }
}