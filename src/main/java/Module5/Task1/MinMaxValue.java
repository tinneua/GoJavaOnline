package Module5.Task1;


import java.util.Arrays;

public class MinMaxValue {

    public static void main(String[] args) {
        int[] sourceArray = {-500,-100,20050, -1000};

        System.out.println("Maximum value is: " + MaxValueFinder.findMax(sourceArray));
        System.out.println("Minimum value is: " + MinValueFinder.findMin(sourceArray));

        ////variant #2, fewer = better
        Arrays.sort(sourceArray);
        System.out.println("Maximum value is: " + sourceArray[sourceArray.length - 1]);
        System.out.println("Minimum value is: " + sourceArray[0]);
    }
}

