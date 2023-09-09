package factory.headfirst.inefficient;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.pizza.CheesePizza;
import factory.headfirst.pizza.GreekPizza;
import factory.headfirst.pizza.PepperoniPizza;

public class PizzaStore {
    enum PizzaType {
        CHEESE,
        GREEK,
        PEPPERONI
    }

    Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza;

        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza();
                preparePizza(pizza);
                return pizza;
            case GREEK:
                pizza = new GreekPizza();
                preparePizza(pizza);
                return pizza;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                preparePizza(pizza);
                return pizza;    
        }

        throw new AssertionError("Invalid or Unknown Pizza type");
    }

    private Pizza preparePizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}