package Module5.Task2;


public class ExchangeSort {
    public static void sortExchange(int[] array) {
        int temp;
        for (int i = 0; i<array.length -1;i++) {
            for (int j = i + 1; j<array.length; j++) {
                if (array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array [j];
                    array [j] = temp;
                }
            }
        }
    }
}
