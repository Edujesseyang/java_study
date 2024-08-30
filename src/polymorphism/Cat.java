package src.polymorphism;

public class Cat extends Animal {
    @Override
    public void calling() {
        System.out.println("Meow...");

    }

    public void catchMouse() {
        System.out.println("catching mouse...");
    }
}
