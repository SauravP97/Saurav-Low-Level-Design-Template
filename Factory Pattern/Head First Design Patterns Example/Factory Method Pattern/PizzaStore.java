package factory.headfirst.factorymethod;

import factory.headfirst.pizza.Pizza;

public abstract class PizzaStore {
    enum PizzaType {
        CHEESE,
        GREEK,
        PEPPERONI
    }

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}