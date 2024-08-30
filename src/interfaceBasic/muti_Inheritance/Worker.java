package src.interfaceBasic.muti_Inheritance;

// it only needs to implement one interface, because that interface extended all necessary father interfaces.
public class Worker implements MaleProgrammer {

    @Override
    public void hateShower() {
        System.out.println("Male Programmer hates shower.");
    }

    @Override
    public void eat() {
        System.out.println(" I can eat.");
    }

    @Override
    public void sleep() {
        System.out.println(" I can sleep.");
    }

    @Override
    public void drinkBeer() {
        System.out.println("Male drink beer.");
    }

    @Override
    public void coding() {
        System.out.println("Programmer love coding.");
    }

    @Override
    public void headache() {
        System.out.println("They have headache all the time.");
    }
}
