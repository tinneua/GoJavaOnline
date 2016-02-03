package Module7;

import java.util.Scanner;


public class SimpleVersion {
    public static double switcher (String operation) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double result;
        switch (operation) {
            case "plus":
                System.out.println("Please enter first number");
                double firstNumber = scanner.nextDouble();
                System.out.println("Please enter second number");
                double secondNumber = scanner.nextDouble();
                result = MathOperations.plus(firstNumber,secondNumber);
                break;
            case "minus":
                System.out.println("Please enter first number");
                firstNumber = scanner.nextDouble();
                System.out.println("Please enter second number");
                secondNumber = scanner.nextDouble();
                result = MathOperations.minus(firstNumber,secondNumber);
                break;
            case "multiply":
                System.out.println("Please enter first number");
                firstNumber = scanner.nextDouble();
                System.out.println("Please enter second number");
                secondNumber = scanner.nextDouble();
                result = MathOperations.multiply(firstNumber,secondNumber);
                break;
            case "divide":
                System.out.println("Please enter first number");
                firstNumber = scanner.nextDouble();
                System.out.println("Please enter second number");
                secondNumber = scanner.nextDouble();
                result = MathOperations.divide(firstNumber,secondNumber);
                break;
            case "^2":
                System.out.println("Please enter number");
                firstNumber = scanner.nextDouble();
                result = MathOperations.power(firstNumber, 2);
                break;
            case "^3":
                System.out.println("Please enter number");
                firstNumber = scanner.nextDouble();
                result = MathOperations.power(firstNumber,3);
                break;
            case "sqrt":
                System.out.println("Please enter number");
                firstNumber = scanner.nextDouble();
                result = MathOperations.sqrt(firstNumber);
                break;
            case "cubeRoot":
                System.out.println("Please enter number");
                firstNumber = scanner.nextDouble();
                result = MathOperations.cubeRoot(firstNumber);
                break;
            default: throw new Exception("Cant find such operation");
        }
    return result;
    }
}
