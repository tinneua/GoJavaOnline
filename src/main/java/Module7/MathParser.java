package Module7;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class MathParser {
    public static void main(String[] args) throws Exception {
        double result;
        System.out.println("Welcome to One-Two Calculator 1.0");
        Boolean endCheck = false;
        while (!endCheck) {
            System.out.println("Please choose your mod: enter 'simple' or 'engineering'");
            Scanner scanner = new Scanner(System.in);
            String mode = scanner.nextLine();
            if (mode.toLowerCase().equals("simple")) {
                System.out.println("Now please choose action. I can plus, minus, multiply, divide, ^2, ^3, sqrt, cubeRoot");
                String operation = scanner.nextLine();
                result = SimpleVersion.switcher(operation);
            } else if (mode.toLowerCase().equals("engineering")) {
                System.out.println("In this mode all that jazz and 'sin', 'cos', 'pow N', 'root N'");
                String operation = scanner.nextLine();
                result = EngineerVersion.switcher(operation);
            } else {
                throw new Exception("Cant understand your choice");
            }
            System.out.println("You result is: " + result);
            System.out.println("Want play again?");
            String end = scanner.nextLine();
            endCheck = !(end.equals("start") || end.equals("again") || end.equals("play") || end.equals("yes"));
        }
    }
}
