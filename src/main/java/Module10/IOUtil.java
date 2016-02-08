package Module10;


import java.util.Scanner;

public class IOUtil {
    public static String getInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    public static void printToConsole(String msg) {
        System.out.println(msg);
    }
}
