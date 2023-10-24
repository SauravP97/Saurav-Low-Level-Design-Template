package observer.headfirst.actual;

import observer.headfirst.actual.observable.WeatherData;
import observer.headfirst.actual.observer.CurrentConditionsDisplay;
import observer.headfirst.actual.observer.ForecastDisplay;
import observer.headfirst.actual.observer.StatisticsDisplay;

public class WeatherDataRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(27.6, 10.0, 8.9);

        // Registering Statistics Display
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // Remove Forecast Display
        weatherData.removeObserver(forecastDisplay);
        
        // Measurements changed
        weatherData.setMeasurements(31.2, 9.5, 11.2);
    }
}