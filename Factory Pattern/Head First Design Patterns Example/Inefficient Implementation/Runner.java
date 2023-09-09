package factory.headfirst.inefficient;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.inefficient.PizzaStore;
import factory.headfirst.inefficient.PizzaStore.PizzaType;

public class Runner {
    public static void main(String[] args) {
        // Initializing a Pizza Store
        PizzaStore pizzaStore = new PizzaStore();

        // Ordering a Cheese Pizze
        Pizza cheesePizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Pizza Ordered: " + cheesePizza.getName());

        System.out.println("\n ====================== \n");

        // Ordering a Pepperoni Pizze
        Pizza pepperoniPizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Pizza Ordered: " + pepperoniPizza.getName());
    }
}