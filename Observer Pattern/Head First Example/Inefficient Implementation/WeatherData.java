package observer.headfirst.inefficient;

import observer.headfirst.inefficient.CurrentConditionsDisplay;
import observer.headfirst.inefficient.StatisticsDisplay;
import observer.headfirst.inefficient.ForecastDisplay;

public class WeatherData {
    private final CurrentConditionsDisplay currentConditionsDisplay;
    private final StatisticsDisplay statisticsDisplay;
    private final ForecastDisplay forecastDisplay;

    public WeatherData() {
        this.currentConditionsDisplay = new CurrentConditionsDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }

    public void measurementChanged() {
        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    public double getTemperature() {
        // Logic to get temperature from the sensors.
        return 32.2;
    }

    public double getHumidity() {
        // Logic to get humidiy from the sensors.
        return 10.1;
    }

    public double getPressure() {
        // Logic to get pressure from the sensors.
        return 22.2;
    }
}