package src.polymorphism;

public class Dog extends Animal {

    @Override
    public void calling() {
        System.out.println("Wool...");
    }

    public void guardDoor() {
        System.out.println("I am guarding door!");
    }
}
