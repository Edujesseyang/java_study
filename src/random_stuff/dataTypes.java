public class dataTypes {

    public static void main(String[] args) {
        /* 4 basic types of data in java:
            1. integers:
                i) byte:     -128 ~ 127                                       1 Byte
                ii) short:   -32768 ~ 32767                                   2 Bytes
                iii) int:    -2147483648 ~ 2147483647 (10 digits)             4 Bytes
                iV) long:    -9223372036854775808 ~ 9223372036854775807       8 Bytes
            2. floating number:
                i) float:    1.401298e-45 ~ 3.402823e+38                      4 Bytes
                ii) double:  4.9000000e-324 ~ 1.797693e+308                   8 Bytes
            3. character:
                char:        0 ~ 65535                                        2 Bytes
            4. Boolean value:
                boolean:     0, 1 (true, false)                               1 Byte
         */
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        char c = 'a';
        boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(bool);
        
    }
}
