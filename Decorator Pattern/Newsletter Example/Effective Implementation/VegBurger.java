package decorator.newsletter.effective;

import decorator.newsletter.effective.Meal;

public class VegBurger extends Meal {
    private double PRICE = 60;

    public VegBurger() {
        description = "Veg Burger";
    }

    public double getPrice() {
        return PRICE;
    }
}