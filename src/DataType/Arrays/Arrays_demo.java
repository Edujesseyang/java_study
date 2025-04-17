package src.DataType.Arrays;

import java.util.Arrays;

public class Arrays_demo {
    public static void main(String[] args) {

        int[] arr = {10, 2, 55, 23, 24, 100, 150, 23, 16};

        // String toString(type[] array)
        String str = Arrays.toString(arr);
        System.out.println(str);

        // void sort(type[] array)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // <T> void sort(type[] array, Comparator<? super T> c)
        // See Comparator_demo


        // int binarySearch(int[] array, int key)
        // If key is not found, it will return the position that the key should to be.
        int result = Arrays.binarySearch(arr, 100);  // return the index of the target.
        System.out.println(result);

        // try myBinarySearch:
        int myResult = myBinarySearch(arr, 100);
        System.out.println(myResult);

        // try checkAndAdd
        int[] myArray = checkAndAdd(arr, 35);
        System.out.println(Arrays.toString(myArray));
    }

    public static int myBinarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int[] checkAndAdd(int[] array, int key) {
        int return_val = Arrays.binarySearch(array, key);
        int[] new_array;
        if (return_val < 0) {
            new_array = new int[array.length + 1];
            for (int i = 0, j = 0; j < array.length; i++, j++) {
                if (i == Math.abs(return_val)-1) {
                    new_array[i] = key;
                    j--;
                } else {
                    new_array[i] = array[j];
                }
            }
        } else {
            return array;
        }
        return new_array;
    }
}
