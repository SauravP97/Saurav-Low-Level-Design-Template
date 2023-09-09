package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        setName();
    }
    
    public void setName() {
        this.name = "New York Style Pepperoni Pizza";
    }
}