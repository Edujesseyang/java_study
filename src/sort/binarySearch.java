package src.sort;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] randomArray = {34, 78, 23, 89, 12, 45, 67, 90, 33, 56, 14, 76, 92, 21, 44, 85, 39, 61, 27, 71};
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        int index = myBinarySearch(randomArray, 45);

        System.out.println(index);
    }

    /**
     * my binary search method
     * @param array sorted int[] array
     * @param key target int
     * @return int index of the target.
     */
    public static int myBinarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // or (left + right) /2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
