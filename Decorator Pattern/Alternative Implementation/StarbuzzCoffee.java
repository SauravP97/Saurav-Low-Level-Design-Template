package decorator.alternate;

import decorator.alternate.Beverage;
import decorator.alternate.HouseBlend;
import decorator.alternate.DarkRoast;
import decorator.alternate.Espresso;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        // Order: House Blend with Soy, Steamed Milk and a Whip
        Beverage beverage1 = new HouseBlend();
        beverage1.setSoy();
        beverage1.setSteamedMilk();
        beverage1.setWhip();
        System.out.println("Coffee ordered: " + beverage1.getDescription());
        System.out.println("Cost: " + beverage1.cost());

        // Order: Dark Roast with Mocha and a Whip
        Beverage beverage2 = new DarkRoast();
        beverage2.setMocha();
        beverage2.setWhip();
        System.out.println("Coffee ordered: " + beverage2.getDescription());
        System.out.println("Cost: " + beverage2.cost());

        // Order: Espresso
        Beverage beverage3 = new Espresso();
        System.out.println("Coffee ordered: " + beverage3.getDescription());
        System.out.println("Cost: " + beverage3.cost());
    }
}