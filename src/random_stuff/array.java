
public class array {

    public static void main(String[] args) {

        // 1) static Initialization:
        //  type[] name = { ... elements... }
        int[] array1 = {10, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.print("Sum of {");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println("} is " + sum);

        // 2) type[] name = new type[]{ ...element... }
        String[] array2 = new String[]{"aa", "bb", "cc"};  // completely syntax
        Double[] array3 = {3.14, 2.72, 9.80};  // simply syntax
        Character array4[] = {'a', 'b', 'c', 'd', 'e'};   // simply syntax (name[] style)
        printArray(array2);
        printArray(array3);
        printArray(array4);

        // 3) Dynamic Initialization: 
        //    type[] name = new type[length];
        Integer[] array5 = new Integer[5];
        // array5 = {0, 0, 0, 0, 0}; b/c the default value for int is 0; 
        array5[0] = 1;
        array5[1] = 2;
        array5[2] = 3;
        array5[3] = 4;
        array5[4] = 5;
        printArray(array5);

        char[] array6 = new char[5];
        array6[1] = 'a';
        // array6 = {0, 0, 0, 0, 0}; default value for char is 0 in ASCII. It will not print out, b/c 0 in ASCII is not printable.
        System.out.println(array6[0]);

        /**
         * ***************************************************************************
         * NOTE: You can NOT mix both static init and dynamic init together: *
         * type[] name = new type[length] { ... Element... }; <== THIS IS
         * WRONG!! *
         *  ***************************************************************************
         */
        // 4) iterating array:
        // way1:
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        // way2:
        for (char element : array6) {
            System.out.println(element);
        }

        System.out.println(findMax(array1));



    }

    public static <T> void printArray(T[] array) {
        // To use the auto type for input, the array type has to be Integer, Double, Character, etc.  
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
