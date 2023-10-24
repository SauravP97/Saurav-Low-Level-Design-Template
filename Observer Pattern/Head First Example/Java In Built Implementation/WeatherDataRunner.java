package observer.headfirst.inbuilt;

import observer.headfirst.inbuilt.WeatherData;
import observer.headfirst.inbuilt.CurrentConditionsDisplay;

public class WeatherDataRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(27.6, 10.0, 8.9);
        
        // Measurements changed
        weatherData.setMeasurements(31.2, 9.5, 11.2);
    }
}
