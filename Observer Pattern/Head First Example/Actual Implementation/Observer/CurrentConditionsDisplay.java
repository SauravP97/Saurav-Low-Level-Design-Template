package observer.headfirst.actual.observer;

import observer.headfirst.actual.observable.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private double temp;
    private double pressure;
    private double humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        // Display current conditions.
        System.out.println("=================================");
        System.out.println("Current Conditions --------------");
        System.out.println("Temperature : " + temp);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println();
    }
}