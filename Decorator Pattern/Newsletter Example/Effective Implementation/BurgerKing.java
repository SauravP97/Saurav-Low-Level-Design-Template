package decorator.newsletter.effective;

import decorator.newsletter.effective.Meal;
import decorator.newsletter.effective.ChickenBurger;
import decorator.newsletter.effective.Cheese;
import decorator.newsletter.effective.Veggies;
import decorator.newsletter.effective.Chips;

public class BurgerKing {
    public static void main(String[] args) {
        // Order: Chicken Burger with Cheese, Veggies and Chips
        Meal burgerMeal = new ChickenBurger();
        burgerMeal = new Cheese(burgerMeal);
        burgerMeal = new Veggies(burgerMeal);
        burgerMeal = new Chips(burgerMeal);

        System.out.println("Order placed: " + burgerMeal.getDescription());
        System.out.println("Price: " + burgerMeal.getPrice());
    }
}