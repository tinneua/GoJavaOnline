package Module5.Task2;


public class BubbleSort {
    public static void sortBubble(int[] array) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i<array.length -1; i++) {
                if (array[i]>array[i+1]) {
                    temp = array[i];
                    array [i] = array[i+1];
                    array [i+1] = temp;
                    flag = true;
                }
            }
        }
    }
}
