package Luhn;

import java.util.Scanner;

/**

 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Card Validator!");
        System.out.println("Please enter card number below:");
        String line = scanner.nextLine();
        while (!line.equals("quit")) {
            InputData data = new InputData();
            data.setInput(line);
            String input = null;
            try {
                input = data.getInput();
            } catch (UnknownCardTypeException e) {
                e.printStackTrace();
            }
            if (input != null && LuhnValidation.checkNumber(input)) {
                System.out.println("\nCard is VALID");
            } else System.out.println("\nSorry, Card is NOT valid");
            System.out.println("\nEnter another card number or 'quit' to terminate application");
            line = scanner.nextLine();
        }
    }
}
