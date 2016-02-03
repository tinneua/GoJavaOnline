package Module7;

import java.util.Scanner;


public class EngineerVersion {
    public static double switcher (String operation) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double result;
        switch (operation) {
            case "sin":
                System.out.println("Please enter number");
                double firstNumber = scanner.nextDouble();
                result = MathOperations.sin(firstNumber);
                break;
            case "cos":
                System.out.println("Please enter number");
                firstNumber = scanner.nextDouble();
                result = MathOperations.cos(firstNumber);
                break;
            case "pow N":
                System.out.println("Please enter  number");
                firstNumber = scanner.nextDouble();
                System.out.println("Please enter N");
                double secondNumber = scanner.nextDouble();
                result = MathOperations.power(firstNumber,secondNumber);
                break;
            case "root N":
                System.out.println("Please enter  number");
                firstNumber = scanner.nextDouble();
                System.out.println("Please enter N");
                secondNumber = scanner.nextDouble();
                if (secondNumber == 0) { throw new Exception("Cant divide by zero"); }
                result = MathOperations.power(firstNumber,1/secondNumber);
                break;
            default: result = SimpleVersion.switcher(operation);
        }
        return result;
    }
}
