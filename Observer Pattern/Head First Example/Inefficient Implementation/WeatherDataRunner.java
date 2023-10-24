package observer.headfirst.inefficient;

import observer.headfirst.inefficient.CurrentConditionsDisplay;
import observer.headfirst.inefficient.StatisticsDisplay;
import observer.headfirst.inefficient.ForecastDisplay;

public class WeatherDataRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementChanged();      
    }
}
