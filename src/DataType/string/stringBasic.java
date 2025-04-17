package src.DataType.string;

public class stringBasic {
    // string type and define
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";

        System.out.println(str1 == str3);  // pop err, says using string compare
        // it will print false, b/c str1 and str3 both are addresses of constant value pool.

        // using .equals()
        System.out.println(str1.equals(str3)); // true

        // case none sensitive compare
        String str4 = "ABC";
        System.out.println(str1.equalsIgnoreCase(str4));  // ture

        // to lowercase or uppercase
        String str5 = str4.toLowerCase();
        System.out.println(str5);
        String str6 = str2.toUpperCase();
        System.out.println(str6);

        // to string...
        Integer num1 = 123456;
        String numStr1 = num1.toString();
        System.out.println(numStr1.getClass().getName());

        // toCharArray()
        char[] charNum = numStr1.toCharArray();
        for (char c : charNum) {
            System.out.print(c + ", ");
        }
        System.out.println();

        // charAt()
        char c1 = numStr1.charAt(3);
        System.out.println(c1);

        // subString()
        String sub1 = numStr1.substring(2,5); // begin/include 2; stop/exclude 5
        System.out.println(sub1);
        String sub2 = numStr1.substring(2); // begin/include 2; stop/include last one
        System.out.println(sub2);
        String sub3 = numStr1.substring(0,3); // begin/include first one; stop/exclude 3
        System.out.println(sub3);

        // replacement
        String update1 = numStr1.replace('3', 'A'); // replace by value.
        System.out.println(update1);

        // check if contains something
        String str7 = "I have a cat!";
        boolean isContains = str7.contains("cat");
        System.out.println(isContains);

        // check if string start with something
        boolean isStartWith = str7.startsWith("I ha");
        System.out.println(isStartWith);

        // split
        String str8 = "I have a cat, his name is Lucky!";
        String[] words1 = str8.split(" ");
        for(String s : words1){
            System.out.println(s);
        }
    }

}
