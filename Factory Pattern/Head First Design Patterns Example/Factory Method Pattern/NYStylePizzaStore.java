package factory.headfirst.factorymethod;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.pizza.NYStyleCheesePizza;
import factory.headfirst.pizza.NYStyleGreekPizza;
import factory.headfirst.pizza.NYStylePepperoniPizza;
import factory.headfirst.factorymethod.PizzaStore;
import factory.headfirst.factorymethod.PizzaStore.PizzaType;

public class NYStylePizzaStore extends PizzaStore {
    
    protected Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case GREEK:
                return new NYStyleGreekPizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
        }
        throw new AssertionError("Invalid or Unknown Pizza type");
    }
}