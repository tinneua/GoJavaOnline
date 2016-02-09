package Module5.Task1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ParametrizedMinMaxValueTest {
    private int[] array;
    private int expectedMin;
    private int expectedMax;

    public ParametrizedMinMaxValueTest(int[] array, int expectedMin, int expectedMax) {
        this.array = array;
        this.expectedMin = expectedMin;
        this.expectedMax = expectedMax;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[] {1,2,5,6,7},1,7},
                {new int[] {-500,200,400},-500,400},
                {new int[] {50,-100,20050}, -100, 20050}
        });
    }

    @Test
    public void testMaxValue() throws Exception {
        Assert.assertEquals(expectedMax, MaxValueFinder.findMax(array));

    }
    @Test
    public void testMinValue() throws Exception {
        Assert.assertEquals(expectedMin, MinValueFinder.findMin(array));

    }
}