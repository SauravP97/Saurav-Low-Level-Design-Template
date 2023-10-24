package observer.headfirst.actual.observable;

import observer.headfirst.actual.observable.Observable;
import observer.headfirst.actual.observer.Observer;
import java.util.ArrayList;

public class WeatherData implements Observable {
    private ArrayList<Observer> observers;
    private double temp;
    private double pressure;
    private double humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temp, pressure, humidity);
        }
    }

    private void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}