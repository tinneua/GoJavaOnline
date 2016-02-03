package Module8;


import java.util.ArrayList;
/*
Bubble Sort method for Collection
 */
public class CollectionSorter {

    public static void sortList (ArrayList<Guitar> list) {
        boolean flag = true;
        Guitar temp;
        while (flag) {
           flag = false;
           for (int i = 0; i<list.size()-1; i++) {
               //to change sorting param just change .getYearOfProduction to other getter
               if(list.get(i).getYearOfProduction() > list.get(i+1).getYearOfProduction() ) {
                   temp = list.get(i);
                   list.set(i, list.get(i+1));
                   list.set(i+1, temp);
                   flag = true;
               }
           }
       }
    }
}
