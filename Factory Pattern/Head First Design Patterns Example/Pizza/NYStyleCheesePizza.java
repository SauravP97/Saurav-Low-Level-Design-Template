package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        setName();
    }
    
    public void setName() {
        this.name = "New York Style Cheese Pizza";
    }
}