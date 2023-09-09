package factory.headfirst.pizza;

import factory.headfirst.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        setName();
    }
    
    public void setName() {
        this.name = "Chicago Style Pepperoni Pizza";
    }
}