
import java.util.InputMismatchException;
import java.util.Scanner;

public class scrambleArray {

    public static void main(String[] args) {
        Integer[] numArray = arrayInput(0);
        Integer[] scrambleArray = scrambleAnArray(numArray);
        scrambleArray = scrambleAnArray(scrambleArray);
        printArray(scrambleArray);

        // String[] strArray = arrayInput(); // FIXME
        // String[] scrambleStrArray = scrambleAnArray(strArray); // FIXME
        // printArray(scrambleStrArray);
    }

    public static Integer[] arrayInput(int max) {
        System.out.println("Enter how many numbers you want to save:");
        Integer[] array = new Integer[0];

        try (Scanner sc = new Scanner(System.in)) {
            max = sc.nextInt();
            sc.nextLine();

            if (max < 0) {
                throw new InputMismatchException("Can't be negative.");
            }

            array = new Integer[max];
            System.out.println("Now, enter your numbers: ");
            for (int i = 0; i < max; i++) {
                array[i] = sc.nextInt();
                sc.nextLine();
            }

        } catch (InputMismatchException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal Argument: " + e.getMessage());
        }
        return array;
    }

    // public static String[] arrayInput() { // FIXME
    //     System.out.println("Enter how many numbers you want to save:");
    //     int max;
    //     String[] array = new String[0];
    //     try (Scanner sc = new Scanner(System.in)) {
    //         max = sc.nextInt();
    //         sc.nextLine();
    //         if (max < 0) {
    //             throw new InputMismatchException("Can't be negative.");
    //         }
    //         array = new String[max];
    //         System.out.println("Now, enter your numbers: ");
    //         for (int i = 0; i < max; i++) {
    //             array[i] = sc.nextLine();
    //         }
    //     } catch (InputMismatchException e) {
    //         System.err.println("Invalid input: " + e.getMessage());
    //     } catch (IllegalArgumentException e) {
    //         System.err.println("Illegal Argument: " + e.getMessage());
    //     }
    //     return array;
    // }
    public static <T> T[] scrambleAnArray(T[] array) {
        System.out.println("Start to scramble array . . .");
        int size = array.length;
        int tempIndex;
        T tempElement;
        for (int i = 0; i < size; i++) {
            tempIndex = (int) (Math.random() * size);
            tempElement = array[i];
            array[i] = array[tempIndex];
            array[tempIndex] = tempElement;
        }

        System.out.println("Mission Completed!");
        return array;
    }

    public static <T> void printArray(T[] array) {
        System.out.println("Print array: ");
        for (T array1 : array) {
            System.out.print(array1 + " ");
        }
        System.out.println();
    }

}
