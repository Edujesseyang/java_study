package src.exception;

public class try_catch_demo {
    public static void main(String[] args) {

        // use try catch to handle exception in place.

        int[] array = {0, 1, 2, 3};
        System.out.println(findNum(array, 5)); // use way 1;

        try {  // use way 2;
            System.out.println(findInt(array, 5));  // try and get the exception if there is one.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());  // handle the exception here.
            // e.printStackTrace();  use this method for developing, it will show more details.
        }


        try {
            int number = findInteger(array, 5);
            System.out.println(number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("new error:  " + e.getMessage());
        }


    }

    // way 1: catch exception in place.
    // pros: handle the error in a small scope;
    // cons: the return value -1 may be received by other methods, causing unknown consequences;
    public static int findNum(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return -1;
    }

    // way 2: throw exception out if there is one:
    // pros: no return value if input is invalid.
    // cons: it will throw exception to upper level. you still have to find a way to handle the exception somewhere else.
    public static int findInt(int[] array, int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("ERROR: index of out bound.");
        } else {
            return array[index];
        }
    }

    public static int findInteger(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }
}
