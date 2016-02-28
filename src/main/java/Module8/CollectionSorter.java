package Module8;



import java.util.List;

/*
Bubble Sort method for List
 */
public class CollectionSorter {

    public static void sortList (List<Guitar> list) {

        boolean flag = true;
        Guitar temp;
        while (flag) {
           flag = false;
           for (int i = 0; i<list.size()-1; i++) {
               if((list.get(i).compareTo(list.get(i+1)))>0) {
                   temp = list.get(i);
                   list.set(i, list.get(i+1));
                   list.set(i+1, temp);
                   flag = true;
               }
           }
       }
    }
}
