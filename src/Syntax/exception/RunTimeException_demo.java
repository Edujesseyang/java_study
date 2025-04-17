package src.Syntax.exception;

public class RunTimeException_demo {
    public static void main(String[] args) {

        // father exception: RunTimeException includes:

        // 1. Array Index Out of Bond exception:
        int[] array = {0, 1, 2};
        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {  // can be replaced with RunTimeException
            System.out.println(e.getMessage());
        }

        // 2. Null pointer exception:
        Integer nullInt = null;
        Integer num = 1;
        try {
            System.out.println(nullInt + num);
        } catch (NullPointerException e) {  // can be replaced with RunTimeException
            System.out.println(e.getMessage());
        }

        // 3. Class cast exception:
        Object a = 1;
        try {
            String b = (String) a;
        } catch (ClassCastException e) {   // can be replaced with RunTimeException
            System.out.println(e.getMessage());
        }

        // 4. Arithmetic Exception:
        try {
            int c = 10 / 0;
        } catch (ArithmeticException e) {  // can be replaced with RunTimeException
            System.out.println(e.getMessage());
        }

        // 5. Number format exception:
        String d = "123a";
        try {
            Integer f = Integer.valueOf(d);
        } catch (NumberFormatException e) {  // can be replaced with RunTimeException
            System.out.println(e.getMessage());
        }
    }
}
