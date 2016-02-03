package Module5.Task2;


public class InsertionSort {
    public static void sortInsertion(int[] array) {
        int i, key;
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            for (i = j -1;(i >= 0) && (array[i] > key); i--) {
                array[i+1] = array[i];
            }
            array[i+1] = key;
        }
    }
}
