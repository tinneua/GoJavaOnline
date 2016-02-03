package Luhn;

/**
Check if given card is valid (correct) or not

 */

public class LuhnValidation {
    public static boolean checkNumber (String input) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        String [] arr = input.split("");
        for (int i = arr.length-1; i<=arr.length && i>=0; i--) {
            if (i%2 == 0) {
                arr[i] = Integer.toString(Integer.parseInt(arr[i])*2);
            }
            result.append(arr[i]);
        }
        for (int i=0; i<result.length();i++) {
            sum +=Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        return sum % 10 == 0;
    }
}
