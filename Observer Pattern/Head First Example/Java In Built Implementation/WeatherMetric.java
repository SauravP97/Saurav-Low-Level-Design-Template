package observer.headfirst.inbuilt;

public class WeatherMetric {
    public double temp;
    public double pressure;
    public double humidity;

    public WeatherMetric(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public void setMetric(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}