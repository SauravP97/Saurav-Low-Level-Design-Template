package observer.headfirst.inbuilt;

import java.util.Observable;
import observer.headfirst.inbuilt.WeatherMetric;

public class WeatherData extends Observable {
    private WeatherMetric weatherMetric;

    public WeatherData() {
        weatherMetric = new WeatherMetric(0.0, 0.0, 0.0);
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers(weatherMetric);
    }

    public void setMeasurements(double temp, double humidity, double pressure) {
        weatherMetric.setMetric(temp, humidity, pressure);
        measurementsChanged();
    }
}