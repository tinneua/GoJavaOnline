package Module8;


import java.util.Comparator;

public class Comparators {
    public static Comparator<Guitar> NAME = (o1, o2) -> o1.getName().compareTo(o2.getName());
    public static Comparator<Guitar> PRICE = (o1, o2) -> (int) (o1.getPrice() - o2.getPrice());
    public static Comparator<Guitar> YEAR = (o1, o2) -> o1.getYearOfProduction()-o2.getYearOfProduction();
}
