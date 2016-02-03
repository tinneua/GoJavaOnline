package Module8;


import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Guitar> musicShop = new ArrayList<>();
        musicShop.add(new Guitar("Stratocaster", 199.99, 1901));
        musicShop.add(new Guitar("Fendermaster", 159.99, 1959));
        musicShop.add(new Guitar("AuchanGuitar", 19.99, 1800));

        CollectionSorter.sortList(musicShop); //sort Collection by Year
        CollectionPrinter.printInfo(musicShop); //print Collection

    }
}
