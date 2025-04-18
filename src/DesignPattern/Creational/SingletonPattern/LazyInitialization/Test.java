package src.DesignPattern.Creational.SingletonPattern.LazyInitialization;

class Test {

    public static void main(String[] args) {

        // test logger
        Exp_Logger logger1 = Exp_Logger.getInstance();
        Exp_Logger logger2 = Exp_Logger.getInstance();

        logger1.log("User 1: did this thing.");
        logger2.log("User 2: did that thing.");

        System.out.println("Print history:");
        logger1.printHistory();

        System.out.println("Is logger1 same as logger2: " + logger1.equals(logger2));
    }



}
