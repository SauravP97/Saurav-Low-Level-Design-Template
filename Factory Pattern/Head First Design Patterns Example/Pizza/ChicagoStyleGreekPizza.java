package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class ChicagoStyleGreekPizza extends Pizza {
    public ChicagoStyleGreekPizza() {
        setName();
    }
    
    public void setName() {
        this.name = "Chicago Style Greek Pizza";
    }
}