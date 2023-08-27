package decorator.newsletter.effective;

import decorator.newsletter.effective.AddOn;
import decorator.newsletter.effective.Meal;

public class Chips extends AddOn {
    private double PRICE = 10.0;
    private Meal meal;

    public Chips(Meal meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return meal.getDescription() + ", Chips";
    }

    public double getPrice() {
        return PRICE + meal.getPrice();
    }
}