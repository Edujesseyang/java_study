public class helloWorld {

    public static void main(String[] args) {
        // ANSI escape code for red text
        String red = "\u001B[31m";
        // ANSI escape code to reset text color to default
        String reset = "\u001B[0m";
        System.out.println("Hello, World!");
        String errMsg = red + "I am an error message!" + reset;
        System.err.println(errMsg);
        System.out.println("I do Java now!");
    }
}
