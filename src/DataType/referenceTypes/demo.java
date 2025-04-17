package src.DataType.referenceTypes;

public class demo {
    public static void main(String[] args) {
        // 8 primitive data types:
        byte b = 1;  // default: 0
        short s = 2;  // default: 0
        int i = 3;  // default: 0
        long l = 4L;  // default: 0
        char c = '5';  // default: \u0000
        float f = 6.0f;  // default: 0.0
        double d = 7.0;  // default: 0.0
        boolean bool = false;  // default: false

        // 8 reference types:
        Byte b1 = 1;  // default: null
        Short s1 = 2;  // default: null
        Integer i1 = 3;  // default: null
        Long l1 = 4L;  // default: null
        Character c1 = '5';  // default: null
        Float f1 = 6.0F;  // default: null
        Double d1 = 7.0;  // default: null
        Boolean bool1 = false;  // default: null

        System.out.println(b == b1);
        System.out.println(s == s1);
        System.out.println(i == i1);
        System.out.println(l == l1);
        System.out.println(c == c1);
        System.out.println(f == f1);
        System.out.println(d == d1);
        System.out.println(bool == bool1);
        System.out.println(f1.equals(f)); // same

        // packing:
        int i2 = 123;
        Integer i3 = i2;
        // un-packing:
        Integer i4 = 250;
        int i5 = i4;

        // use toString()
        System.out.println(i4.toString() + 1);
        // or
        System.out.println(i3 + "" + 321);

        // string parse
        String numStr = "123";
        int num = Integer.parseInt(numStr);  // return int
        System.out.println(num + 27);
        String doubleStr = "3.1415629";
        double db = Double.parseDouble(doubleStr);  // return double

        // valueOf
        Integer num2 = Integer.valueOf(numStr);  // return Integer
        Double db2 = Double.valueOf(doubleStr);  // return Double
    }
}
