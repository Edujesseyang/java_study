public class autoTypeInput {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};       // Wrapper class for int
        Double[] doubleArray = {1.1, 2.2, 3.3};    // Wrapper class for double
        String[] strArray = {"Apple", "Banana", "Cherry"};  // String array

        printArray(intArray);    // Should work with Integer arrays
        printArray(doubleArray); // Should work with Double arrays
        printArray(strArray);    // Should work with String arrays
    }

    /* For types like int, double, char, etc. They are primitive type:
        Usage: Used for simple numeric operations, where you need efficient and lightweight processing.
        Memory: Stored directly in the stack (or in registers, depending on the JVM and optimization).
        Cannot be null: int variables cannot hold a null value; they must always contain a valid integer.
       For types like String, Integer, Double, etc. They are wrapper class.
        Usage: Used when you need an object to represent an integer value, such as in collections (e.g., ArrayList<Integer>), 
               or when you need to utilize methods provided by the Integer class.
        Memory: Stored in the heap, as it’s an object, and references to it are stored in the stack.
        Can be null: Integer can hold a null value, which is useful in situations where the absence of a value is meaningful.
     */

    public static <T> void printArray(T[] array) {
        // To use the auto type for input, the array type has to be Integer, Double, Character, etc. 
        for (T element : array) {
            System.out.println(element);
        }
    }
}
