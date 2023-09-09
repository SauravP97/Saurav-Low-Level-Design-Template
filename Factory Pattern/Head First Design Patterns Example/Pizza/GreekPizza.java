package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class GreekPizza extends Pizza {
    public GreekPizza() {
        setName();
    }
    
    public void setName() {
        this.name = "Greek Pizza";
    }
}