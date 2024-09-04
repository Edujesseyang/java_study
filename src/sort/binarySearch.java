package src.sort;

public class binarySearch {
    public static void main(String[] args) {
        int[] randomArray = {34, 78, 23, 89, 12, 45, 67, 90, 33, 56, 14, 76, 92, 21, 44, 85, 39, 61, 27, 71};
        int index = myBinarySearch(randomArray, 45);
        System.out.println(index);
    }

    public static int myBinarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
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
