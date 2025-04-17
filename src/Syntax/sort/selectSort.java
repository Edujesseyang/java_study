package src.Syntax.sort;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] randomArray = {34, 78, 23, 89, 12, 45, 67, 90, 33, 56, 14, 76, 92, 21, 44, 85, 39, 61, 27, 71};

        myBubbleSort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        int[] randomArray2 = {34, 78, 23, 89, 12, 45, 67, 90, 33, 56, 14, 76, 92, 21, 44, 85, 39, 61, 27, 71};
        mySelectSort(randomArray2);
        System.out.println(Arrays.toString(randomArray2));

    }

    public static void myBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void mySelectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
