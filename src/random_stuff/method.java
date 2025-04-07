
public class method {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        theMethod(); // executes prototype method;
        theMethod("Hello, ");  // executes overloaded method with parameter;
        System.out.println(theMethod1()); // executes prototype method1;
        System.out.println(theMethod1("Hello, "));  // executes overloaded method1 with parameter;

        int x = 100;
        int y = 150;
        System.out.println("sum is: " + sum(x, y));
        System.out.println("sum is: " + sum(x));
        System.out.println("sum is: " + sum());

        System.out.println("sum is: " + sumOneToN(10));
        System.out.println("sum is: " + sumOneToN1(10));
        System.out.println("sum is: " + sumOneToN2(10));
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 = {};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = findElement(array, 10);
        System.out.println("index is: " + index);
        int index2 = findElement(array, 11);
        System.out.println("index is: " + index2);

        int index3 = findElement(array1, 10);
        System.out.println("index is: " + index3);

        System.out.println("Is array and array2 same: " + sameArray(array, array2));
        System.out.println("Is array and array1 same: " + sameArray(array, array1));

        int a = 0;
        tryReturn(a);

    }

    // define method: 
    /**
     * @param None
     * @return None
     */
    public static void theMethod() {
        System.out.println("I just got executed!");
    }

    /**
     * @param something
     * @return none overload
     */
    public static void theMethod(String something) {
        System.err.println("I just got executed!" + something);
    }

    /**
     * @param none
     * @return String
     */
    public static String theMethod1() {
        return "I just got executed!";
    }

    /**
     * @param something
     * @return String overload
     */
    public static String theMethod1(String something) {
        return "I just got executed!" + something;
    }

    // There is no way to use default params in java
    // public static int sum(int a = 0, int b = 0){
    //     return a + b;  
    // }
    // use overload to achieve the similar function
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a) {
        return sum(a, 0);
    }

    public static int sum() {
        return sum(0, 0);
    }

    public static int sumOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOneToN1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOneToN1(n - 1);
        }
    }

    public static int sumOneToN2(int n) {
        return n * (n + 1) / 2;
    }

    /**
     * look for an element
     *
     * @param array int[] array
     * @param target int target int
     * @return int the index of the data
     */
    public static int findElement(int[] array, int target) {
        if (array == null) {
            return -1;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;

    }

    /**
     * check if two array are same.
     *
     * @param array1
     * @param array2
     * @return boolean
     */
    public static boolean sameArray(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void tryReturn(int a) {
        if (a > 0) {
            System.out.println("a > 0");
            return;
        }
        if (a < 0) {
            System.out.println("a is not 0");
            return;
        }
        System.out.println("a is 0");
    }
}
