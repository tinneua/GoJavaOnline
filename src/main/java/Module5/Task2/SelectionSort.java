package Module5.Task2;


public class SelectionSort {
    public static void sortSelection(int[] array) {
        int first, temp;
        for (int i = array.length -1;i > 0; i--) {
            first = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j]>array[first]) {
                    first = j;
                }
            }
            temp = array[first];
            array[first] = array[i];
            array[i] = temp;
        }
    }
}
