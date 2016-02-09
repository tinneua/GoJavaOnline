package Module4.Task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ParameterizedDistanceCalculatorTest {
    private final double DELTA = 0.5;
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double expected;

    public ParameterizedDistanceCalculatorTest(double x1, double x2, double y1, double y2, double expected) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "{index} Distance from ({0};{2}) to ({1};{3}) = {4}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1,2,1,2,1.4},
                {3,4,3,4,1.4},
                {-1,5,0,2,6}
        });

    }
    @Test
    public void testDistance() throws Exception {
        CalculateDistance calculator = new CalculateDistance();
        calculator.setX(x1,y1);
        calculator.setY(x2,y2);
        Assert.assertEquals(expected, calculator.getDistance(), DELTA);
    }
}