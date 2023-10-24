package observer.headfirst.inbuilt;

import java.util.Observer;
import java.util.Observable;
import observer.headfirst.inbuilt.WeatherData;
import observer.headfirst.inbuilt.WeatherMetric;

public class CurrentConditionsDisplay implements Observer {
    private Observable observable;
    private double temp;
    private double pressure;
    private double humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            WeatherMetric weatherMetric = (WeatherMetric)arg;
            this.temp = weatherMetric.temp;
            this.pressure = weatherMetric.pressure;
            this.humidity = weatherMetric.humidity;
            display();
        }
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