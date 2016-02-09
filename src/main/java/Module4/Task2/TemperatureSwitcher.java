package Module4.Task2;

public class TemperatureSwitcher {

    public static void main(String[] args) {
        final double i = 451;
        Celsius celsius = new Celsius();
        celsius.setTemperature(i);
        System.out.println("Celsius "+i+" is equal to "+celsius.getTemperature()+" F");
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTemperature(i);
        System.out.println("Fahrenheit "+i+" is equal to "+fahrenheit.getTemperature()+" C");
    }
}
