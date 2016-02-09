package Module5.Task1;


public class MaxValueFinder {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i <= array.length-1; i++) {
            if (i == array.length-1) {
                max = array[i] > max ? array[i] : max;
                break;
            }
            else if (array[i] > array[i + 1] && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
