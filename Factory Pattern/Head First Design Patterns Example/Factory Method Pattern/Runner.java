package factory.headfirst.factorymethod;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.factorymethod.PizzaStore.PizzaType;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\n ====================== \n");

        // Create a New York Style Greek Pizza
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        Pizza nyGreekPizza = nyPizzaStore.orderPizza(PizzaType.GREEK);
        System.out.println("Orederd Pizza: " + nyGreekPizza.getName());

        System.out.println("\n ====================== \n");

        // Create a Chicago Style Cheese Pizza
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Orederd Pizza: " + chicagoCheesePizza.getName());

        System.out.println("\n ====================== \n");

        // Create New York Style Pepperoni Pizza
        Pizza nyPepperoniPizza = nyPizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Orederd Pizza: " + nyPepperoniPizza.getName());

        System.out.println("\n ====================== \n");
    }
}