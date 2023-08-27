package decorator.newsletter.classexplosion;

import decorator.newsletter.classexplosion.Meal;

public class ChickenBurgerWithCheeseAndSauce extends Meal {
    public ChickenBurgerWithCheeseAndSauce() {
        description = "Chicken Burger with Cheese and Sauce";
    }

    public double getPrice() {
        // Price of:
        //   1. Chicken Burger: Rs. 70
        //   2. Ceese: Rs. 20
        //   3. Sauce: Rs. 10
        return (70.0 + 20.0 + 10.0);
    }
}