package Module5.Task2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ParametrizedSortArrayTest {
    private int[] array;
    private int[] expected;
    public ParametrizedSortArrayTest(int[] array, int[] expected) {
        this.array = array;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[] {1,10,-4,2}, new int[] {-4,1,2,10}},
                {new int[] {11,-410,0,25}, new int[] {-410,0,11,25}},
                {new int[] {-1001,2,34,56}, new int[] {-1001,2,34,56}}
        });
    }

    @Test
    public void testBubbleSort() throws Exception {
        BubbleSort.sortBubble(array);
        Assert.assertEquals(true, Arrays.equals(expected,array));
    }
}