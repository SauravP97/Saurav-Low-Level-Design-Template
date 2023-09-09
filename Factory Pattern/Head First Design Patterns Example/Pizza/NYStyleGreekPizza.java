package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class NYStyleGreekPizza extends Pizza {
    public NYStyleGreekPizza() {
        setName();
    }
    
    public void setName() {
        this.name = "New York Style Greek Pizza";
    }
}