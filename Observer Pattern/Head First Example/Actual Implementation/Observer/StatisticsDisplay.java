package observer.headfirst.actual.observer;

import observer.headfirst.actual.observable.Observable;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private double temp;
    private double pressure;
    private double humidity;

    public StatisticsDisplay(Observable observable) {
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
        // Calculate Forecast
        System.out.println("=================================");
        System.out.println("StatisticsDisplay Stats -----------");
        System.out.println("Temperature : " + temp);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println();
    }
}