
public class bubleSort {

    public static void main(String[] args) {
        int[] unsorted = {5, 2, 7, 1, 8, 6, 3, 9, 4, 0};
        printArray(unsorted);
        int[] sorted = selectSort(unsorted);
        printArray(sorted);
        int[] sorted2 = bubbleSort(unsorted);
        printArray(sorted2);

    }

    public static int[] selectSort(int[] array) {
        int temp;
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int size = array.length;
        int temp;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
