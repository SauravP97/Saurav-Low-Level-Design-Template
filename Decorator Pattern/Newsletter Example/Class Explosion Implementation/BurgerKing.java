package decorator.newsletter.classexplosion;

import decorator.newsletter.classexplosion.ChickenBurgerWithCheeseAndSauce;

public class BurgerKing {
    public static void main(String[] args) {
        Meal meal = new ChickenBurgerWithCheeseAndSauce();
        System.out.println("Order placed: " + meal.getDescription());
        System.out.println("Cost: Rs. " + meal.getPrice());
    }
}