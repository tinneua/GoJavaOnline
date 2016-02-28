package Module8;


import java.util.List;

public class CollectionPrinter {
    public static void printList (List<Guitar> list) {
        System.out.println("NAME\t\t\t" + "PRICE\t\t" + "YEAR OF PRODUCTION");
        list.stream().forEach(System.out::println);
    }
}
