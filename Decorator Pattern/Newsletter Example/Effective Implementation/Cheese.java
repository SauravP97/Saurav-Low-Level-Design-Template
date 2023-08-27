package decorator.newsletter.effective;

import decorator.newsletter.effective.AddOn;
import decorator.newsletter.effective.Meal;

public class Cheese extends AddOn {
    private double PRICE = 20.0;
    private Meal meal;

    public Cheese(Meal meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return meal.getDescription() + ", Cheese";
    }

    public double getPrice() {
        return PRICE + meal.getPrice();
    }
}