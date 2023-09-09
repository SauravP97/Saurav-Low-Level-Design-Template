package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        setName();
    }
    
    public void setName() {
        this.name = "Cheese Pizza";
    }
}