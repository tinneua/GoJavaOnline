package Module4.Task2;


public class Fahrenheit {
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return (temperature - 32)*5/9;

    }
}
