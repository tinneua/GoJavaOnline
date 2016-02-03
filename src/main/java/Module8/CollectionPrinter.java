package Module8;

import java.util.ArrayList;

public class CollectionPrinter {
    public static void printInfo (ArrayList<Guitar> list) {
        System.out.println("NAME\t\t\t" + "PRICE\t\t" + "YEAR OF PRODUCTION");
        list.stream().forEach(System.out::println);
    }
}
