package decorator.headfirst;

import decorator.headfirst.Beverage;
import decorator.headfirst.Espresso;
import decorator.headfirst.DarkRoast;
import decorator.headfirst.Mocha;
import decorator.headfirst.Whip;
import decorator.headfirst.SteamedMilk;
import decorator.headfirst.Soy;
import decorator.headfirst.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        // Order: Espresso
        Beverage beverage1 = new Espresso();
        System.out.println("Coffee ordered: " + beverage1.getDescription());
        System.out.println("Total cost: " + beverage1.cost());

        // Order: Dark Roast with double Mocha and a Whip
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("Coffee ordered: " + beverage2.getDescription());
        System.out.println("Total cost: " + beverage2.cost());

        // Order: House Blend with Soy, Steamed Milk and a Whip
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new SteamedMilk(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("Coffee ordered: " + beverage3.getDescription());
        System.out.println("Total cost: " + beverage3.cost());
    }
}