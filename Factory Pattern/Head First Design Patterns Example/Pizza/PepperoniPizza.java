package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        setName();
    }
    
    public void setName() {
        this.name = "Pepperoni Pizza";
    }
}