public class dataTypeConvert {
    public static void main(final String[] args){
        final double test = 124.432;
        final int result = double_int(test);
        System.out.println("Testing(int): " + test + '\n');
        System.out.println("Result(double): " + result + '\n');


        final char a ='a', b = 'b', c = 'c';
        final String abc = charsConcat(a, b, c);
        System.out.println("To concat chars in to a string: \nChars: " + a + ", " + b + ", " + c);
        System.out.println("The result string is : " + abc);

        // data type conversion: (new type) newName = (target type) varName
        int i = 12;
        byte j = (byte) i;
        System.out.println(j);

        // If data out of the range for new type. Data overflow happens.
        int x = 130;
        byte y = (byte) x;
        System.out.println(y); // it will print -126

        // If double to int, it will round down to int.
        double dd = 245.54;
        int id = (int) dd;
        System.out.println(id); // it will print 245)

      
    }

    public static int double_int(final double input){
        return (int) input;
    }

    public static String charsConcat(final char a, final char b, final char c){
        return "" + a + b + c;
    }

    // Auto data type convert: byte,short, char --> int --> long --> float --> double
}
