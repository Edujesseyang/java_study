
public class verificationCodeGenerator {

    public static void main(String[] args) {
        System.out.println(codeGenerate(6));
        System.out.println(codeGenerate(7));
        System.out.println(codeGenerate(8));
        System.out.println(codeGenerate(16));
        System.out.println(codeGenerate(4));
        System.out.println(codeGenerate(36));

    }

    public static String codeGenerate(int digit) {
        int randNum;
        String result = "";
        for (int i = 0; i < digit; i++) {
            randNum = (int) (Math.random() * 3);
            switch (randNum) {
                case 0 -> result += (char) (((int) (Math.random() * 10)) + 48);
                case 1 -> result += (char) (((int) (Math.random() * 26)) + 65);
                default -> result += (char) (((int) (Math.random() * 26)) + 97);
            }
        }
        return result;
    }
}
