
public class encryption {

    public static void main(String[] args) {
        int num = encrypt(1983);
        System.out.println(num);
        int origin = decrypt(num);
        System.out.println(origin);
    }

    public static int encrypt(int num) {
        int length = (int) (Math.log10(num)) + 1;
        int result = 0;
        for (int i = 0; i < length; i++) {
            int dig = num % 10;
            dig = (dig + 5) % 10;
            result = result * 10 + dig;
            num /= 10;
        }
        return result;
    }

    public static int decrypt(int num) {
        int length = (int) (Math.log10(num)) + 1;
        int result = 0;
        for (int i = 0; i < length; i++) {
            int dig = num % 10;
            if (dig <= 5) {
                dig = (dig + 10) - 5;
            } else {
                dig = dig - 5;
            }
            result = result * 10 + dig;
            num /= 10;
        }
        return result;
    }
}
