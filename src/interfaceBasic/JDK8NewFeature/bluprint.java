package src.interfaceBasic.JDK8NewFeature;

public interface bluprint {

    // before JDK8, you cannot write method body in an interface.
    void someMethod();

    // after JDK8, use the default keyword, you can write method body in the interface.
    default void newMethod() {
        System.out.println("You can write behavior here.");
    }

    // use static keyword to make the method be like public static method.
    static void staticMethod() {
        System.out.println("You can write behavior here.");
    }

    // use private keyword to make a method only accessible within the same interface.
    private String privateMethod() {
        return "This is a private msg.";
    }

    default void getMsg() {
        // access the private method in the class, it works as a helper method.
        System.out.println(privateMethod());
    }
}
