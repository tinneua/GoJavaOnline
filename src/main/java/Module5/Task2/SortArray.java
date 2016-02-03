package Module5.Task2;


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Bubble Sort check
        int[] array1 = {2,5,89,123,-90,0,-1,5,8,66,3};
        BubbleSort.sortBubble(array1);
        for (int element:array1) {
            System.out.print(element+" ");
        }
        System.out.println(" ");
        // Exchange Sort check
        int[] array2 = {2,5,89,123,-90,0,-1,5,8,66,3};
        ExchangeSort.sortExchange(array2);
        for (int element:array2) {
            System.out.print(element+" ");
        }
        System.out.println(" ");
        //Selection Sort check
        int[] array3 = {2,5,89,123,-90,0,-1,5,8,66,3};
        SelectionSort.sortSelection(array3);
        for (int element:array3) {
            System.out.print(element+" ");
        }
        System.out.println(" ");
        //Insertion Sort check
        int[] array4 = {2,5,89,123,-90,0,-1,5,8,66,3};
        InsertionSort.sortInsertion(array4);
        for (int element:array4) {
            System.out.print(element+" ");
        }
        System.out.println(" ");
        //The shortest way Sort :)
        int[] array5 = {2,5,89,123,-90,0,-1,5,8,66,3};
        Arrays.sort(array5);
        for (int element:array5) {
            System.out.print(element+" ");
        }
        System.out.println(" ");
    }
}
