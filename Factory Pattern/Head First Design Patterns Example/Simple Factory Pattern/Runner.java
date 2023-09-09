package factory.headfirst.simplefactory;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.simplefactory.PizzaStore;
import factory.headfirst.simplefactory.SimplePizzaFactory.PizzaType;

public class Runner {
    public static void main(String[] args) {
        // Initializing a Pizza Store
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        // Ordering a Cheese Pizze
        Pizza cheesePizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Pizza Ordered: " + cheesePizza.getName());

        System.out.println("\n ====================== \n");

        // Ordering a Pepperoni Pizze
        Pizza pepperoniPizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Pizza Ordered: " + pepperoniPizza.getName());
    }
}