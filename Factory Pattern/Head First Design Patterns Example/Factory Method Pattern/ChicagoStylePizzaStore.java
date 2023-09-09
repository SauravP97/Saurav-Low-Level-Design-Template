package factory.headfirst.factorymethod;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.pizza.ChicagoStyleCheesePizza;
import factory.headfirst.pizza.ChicagoStyleGreekPizza;
import factory.headfirst.pizza.ChicagoStylePepperoniPizza;
import factory.headfirst.factorymethod.PizzaStore;
import factory.headfirst.factorymethod.PizzaStore.PizzaType;

public class ChicagoStylePizzaStore extends PizzaStore {
    
    protected Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case GREEK:
                return new ChicagoStyleGreekPizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
        }
        throw new AssertionError("Invalid or Unknown Pizza type");
    }
}