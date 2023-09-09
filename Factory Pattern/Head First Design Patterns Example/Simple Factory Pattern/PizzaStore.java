package factory.headfirst.simplefactory;

import factory.headfirst.simplefactory.SimplePizzaFactory;
import factory.headfirst.simplefactory.SimplePizzaFactory.PizzaType;
import factory.headfirst.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = factory.createPizza(pizzaType);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}