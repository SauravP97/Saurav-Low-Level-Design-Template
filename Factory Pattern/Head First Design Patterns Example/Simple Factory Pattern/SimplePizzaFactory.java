package factory.headfirst.simplefactory;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.pizza.CheesePizza;
import factory.headfirst.pizza.GreekPizza;
import factory.headfirst.pizza.PepperoniPizza;

public class SimplePizzaFactory {
    enum PizzaType {
        CHEESE,
        GREEK,
        PEPPERONI
    }

    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case GREEK:
                pizza = new GreekPizza();
                break;
            default:
                break;           
        }

        return pizza;
    }
}