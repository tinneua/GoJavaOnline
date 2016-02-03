package Module6.Task2;


import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {

    public static void main(String[] args) throws IsPositiveException {
       int numberElementsInt;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of elements in array (max 100)");
        final String numberElements = s.nextLine();

        try {
            numberElementsInt = NumberElementsParser.parseNumber(numberElements);
        } catch (NumberFormatException ex) {
            System.err.println("[Error]: Number Format mismatch");
            return;
        } catch (InvalidElementsException e) {
        System.err.println("[Error]: Invalid number of elements");
        return;
    }
        int[] sourceArray = new int[numberElementsInt];
        System.out.println("Please enter each element of array. !Note! Only positive numbers");
        for (int i = 0; i<numberElementsInt; i++) {
            int enteredValue = s.nextInt();
            if (enteredValue < 0 ) {
                System.err.println("[Error] Entered number is negative");
                throw new IsPositiveException(enteredValue);
            }
            sourceArray[i] = enteredValue;
        }

        Arrays.sort(sourceArray);
        System.out.println("Maximum value is: " + sourceArray[sourceArray.length - 1]);
        System.out.println("Minimum value is: " + sourceArray[0]);
    }
}

