package Module5.Task1;


import java.util.Arrays;

public class MinMaxValue {

    public static void main(String[] args) {
        int[] sourceArray = {1, 5, 6, 57, -100, 32, -7, 15};

        //// variant #1, too many lines :)
        int max = 0;
        int min = 0;
        for (int i = 0; i < sourceArray.length - 1; i++) {
            if (sourceArray[i] > sourceArray[i + 1] && sourceArray[i] > max) {
                max = sourceArray[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        for (int i = 0; i < sourceArray.length - 1; i++) {
            if (sourceArray[i] < sourceArray[i + 1] && sourceArray[i] < min) {
                min = sourceArray[i];
            }
        }
        System.out.println("Minimum value is: " + min);

        ////variant #2, fewer lines = better
        Arrays.sort(sourceArray);
        System.out.println("Maximum value is: " + sourceArray[sourceArray.length - 1]);
        System.out.println("Minimum value is: " + sourceArray[0]);
    }
}

