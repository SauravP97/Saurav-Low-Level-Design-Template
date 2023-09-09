package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName();
    }
    
    public void setName() {
        this.name = "Chicago Style Cheese Pizza";
    }
}