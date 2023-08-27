package decorator.newsletter.effective;

import decorator.newsletter.effective.AddOn;
import decorator.newsletter.effective.Meal;

public class Veggies extends AddOn {
    private double PRICE = 15.0;
    private Meal meal;

    public Veggies(Meal meal) {
        this.meal = meal;
    }

    public String getDescription() {
        return meal.getDescription() + ", Veggies";
    }

    public double getPrice() {
        return PRICE + meal.getPrice();
    }
}