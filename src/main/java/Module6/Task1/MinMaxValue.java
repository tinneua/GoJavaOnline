package Module6.Task1;


import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {

    public static void main(String[] args) {
       int numberElementsInt;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of elements in array");
        final String numberElements = s.nextLine();
        try {
            numberElementsInt = NumberElementsParser.parseNumber(numberElements);
        } catch (NumberFormatException ex) {
            System.out.println("[Error]: Number Format mismatch");
            return;
        }
        int[] sourceArray = new int[numberElementsInt];
        System.out.println("Please enter each element of array:");
        for (int i = 0; i<numberElementsInt; i++) {
            sourceArray[i] = s.nextInt();
        }

        Arrays.sort(sourceArray);
        System.out.println("Maximum value is: " + sourceArray[sourceArray.length - 1]);
        System.out.println("Minimum value is: " + sourceArray[0]);
    }
}

