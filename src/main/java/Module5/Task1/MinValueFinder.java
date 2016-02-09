package Module5.Task1;

public class MinValueFinder {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length-1) {
                min = array[i] < min ? array[i] : min;
                break;
            }
            else if (array[i] < array[i + 1] && array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
