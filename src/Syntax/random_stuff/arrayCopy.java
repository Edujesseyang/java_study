
public class arrayCopy {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = myArrayCopy(array);
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] newCopy = new int[array.length];
        copyLtoR(array, newCopy);
        for (int element : newCopy) {
            System.out.print(element + " ");
        }

    }

    public static int[] myArrayCopy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void copyLtoR(int[] origin, int[] copy) {
        for (int i = 0; i < origin.length; i++) {
            copy[i] = origin[i];
        }
    }

}
