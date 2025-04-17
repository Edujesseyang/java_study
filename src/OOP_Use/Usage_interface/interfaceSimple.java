package src.OOP_Use.Usage_interface;

/**
 * Interface can be seen as a template, contract, or blueprint of class.
 */
public interface interfaceSimple {

    // there are only two things can be in interface
    // 1. final member variables.
    // 2. abstract methods.
    // that means we don't have to write the public final and abstract. it will automatically generate.

    int PORT = 8888; // public final int port = 8888;

    void printPort(); // public abstract void printPort();

    String SOME_IMPORTANT_INFO = " I am important! ";

    void printInfo();
}
