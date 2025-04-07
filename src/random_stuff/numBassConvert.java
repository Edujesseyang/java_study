public class numBassConvert {

    public static void main(String[] args) {
        // To convert number between bin, hex, oct.
        /*  We can use:
                    bi: add "0B" in the front of the binary number.                    
                    oct: add "0" in the front of the oct number.
                    hex: add "0x" in the front of the hex number.
         */
        int i1 = 0B01100001;
        System.err.println(i1);

        int i2 = 0141;
        System.err.println(i2);

        int i3 = 0x61;
        System.err.println(i3);

        // i1, i2, and i3 are same int(97). with different way to represent.
    }

}
