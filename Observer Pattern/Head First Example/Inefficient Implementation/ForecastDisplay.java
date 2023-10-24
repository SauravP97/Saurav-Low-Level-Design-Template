package observer.headfirst.inefficient;

public class ForecastDisplay {
    private double temp;
    private double pressure;
    private double humidity;

    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        // Calculate Forecast
        System.out.println("=================================");
        System.out.println("ForecastDisplay Stats: ");
        System.out.println("Temperature - " + temp);
        System.out.println("Humidity - " + humidity);
        System.out.println("Pressure - " + pressure);
        System.out.println();
    }
}
