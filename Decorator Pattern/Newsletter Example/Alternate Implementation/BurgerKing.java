package decorator.newsletter.alternateimpl;

import decorator.newsletter.alternateimpl.Meal;
import decorator.newsletter.alternateimpl.ChickenBurger;

public class BurgerKing {
    public static void main(String[] args) {
        // Order a Chicken Burger with Cheese and Sauce
        Meal burgerMeal = new ChickenBurger();
        burgerMeal.putCheese();
        burgerMeal.putSauce();

        System.out.println("Order placed: " + burgerMeal.getDescription());
        System.out.println("Cost: " + burgerMeal.getPrice());
    }
}