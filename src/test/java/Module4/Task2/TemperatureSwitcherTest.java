package Module4.Task2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TemperatureSwitcherTest {
    private static Celsius celsius;
    private static Fahrenheit fahrenheit;
    private final double DELTA = 0D;

    @BeforeClass
    public static void setUpClass() throws Exception {
        celsius = new Celsius();
        fahrenheit = new Fahrenheit();
    }

    @Test
    public void testCelsius() throws Exception {
        celsius.setTemperature(50);
        Assert.assertEquals(122, celsius.getTemperature(), DELTA);
    }

    @Test
    public void testFahrenheit() throws Exception {
        fahrenheit.setTemperature(50);
        Assert.assertEquals(10, fahrenheit.getTemperature(), DELTA);
    }
}