package src.interfaceBasic;

/**
 * If a class implemented an interface. It has to follow the blueprint to override all the abstract methods.
 */

public class implementClass implements interfaceSimple, blueprint { // a class can implements multiple interfaces.
    // after implements the interface.
    // this class has to override all abstract methods that are defined in the interface.
    @Override
    public void printPort() {
        // we can use those final member variables that are defined in the interface.
        System.out.println(PORT); // interfaceSimple.port is a better way to code.
    }

    @Override
    public void printInfo() {
        // good practice is use the interfaceName.finalMemberName to get the variable.
        System.out.println(interfaceSimple.SOME_IMPORTANT_INFO);
    }

    //override the blueprint abstract method.
    @Override
    public void blueprintRule() {
        System.out.println("I'm following the blueprint rule.");
    }
}
