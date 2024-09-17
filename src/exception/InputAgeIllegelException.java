package src.exception;

public class InputAgeIllegelException extends Exception {
    public InputAgeIllegelException() {
        super();
    }

    public InputAgeIllegelException(String message) {
        super(message);
    }

    public static void checkAge(int age) throws InputAgeIllegelException {
        if (age <= 0 || age > 120) {
            throw new InputAgeIllegelException("Illegal age input");
        } else if (age >= 18) {
            System.out.println("You are adult, you can drink!");
        } else {
            System.out.println("You are too young to drink!");
        }
    }

}
