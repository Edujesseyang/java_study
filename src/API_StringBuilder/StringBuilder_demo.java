package src.API_StringBuilder;

public class StringBuilder_demo {
    public static void main(String[] args) {
        // This class has no-param constructor
        StringBuilder str1 = new StringBuilder();
        str1.append('a');
        str1.append(1);
        str1.append(2.5);
        str1.append(false);
        str1.append("aaa");
        System.out.println(str1); // StringBuilder can append many different types.

        // with param int means capasity, string means default string:
        StringBuilder sam1 = new StringBuilder(5); // means length = 5;
        StringBuilder sam2 = new StringBuilder("Start: "); // means default is "starts: "

        // .append() method returns this. we can use it like:
        String str1_str = str1.append("something").toString(); // chaining append and .toString();
        // or chaining:
        str1.append(1).append(2).append(3).append(4).append(5);
        System.out.println(str1);

        // reverse the string.
        str1.reverse();
        System.out.println(str1);

        // convert the StringBuilder to String.
        String str1_toString = str1.toString();
        printStr(str1_toString);

        // try the method:
        int[] try1 = DoubleIntArr(5);
        String try1_string = intArrToString(try1);
        System.out.println(try1_string);


    }

    // here if a method param is a String type. we can input StringBuilder into the method.
    public static void printStr(String string) {
        System.out.println(string);
    }

    public static int[] DoubleIntArr(int max) {
        int[] result = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = (i + 1) * 10 + (i + 1);
        }
        return result;
    }

    public static String intArrToString(int[] intArr) {
        if (intArr != null) {
            StringBuilder result = new StringBuilder("[");
            for (int i = 0; i < intArr.length; i++) {
                result.append(intArr[i]).append(i == intArr.length - 1 ? "" : ", ");
            }
            result.append("]");
            return result.toString();
        } else {
            return "null";
        }
    }
}