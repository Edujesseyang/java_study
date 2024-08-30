package src.polymorphism;

public class test {
    public static void main(String[] args) {
        // polymorphism:
        // fatherClass name = new childConstructor;
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        // here a3 is a normal animal type. has its own methods
        Animal a3 = new Animal();

        // a1 and a2 are the same type.
        // but a1 and a2 have different methods
        a1.calling();
        a2.calling();
        // a3 has father's method
        a3.calling();

        // the method handles the same type of parameter use different member methods.
        action(a1);
        action(a2);
        action(a3);

        // the method also can take all children class as parameter
        Dog d1 = new Dog();
        action(d1);
        Cat c1 = new Cat();
        action(c1);

        doYourJob(a1);
        doYourJob(a2);
        doYourJob(a3); // a3 is father class, won't call any member method

    }

    // if we need a method can talk all kinds of animal as param.

    public static void action(Animal a) {
        System.out.println("Ready!");
        a.calling();
        System.out.println("Cut!");
    }

    // if we have a method need to use the member method only defined in child class
    public static void doYourJob(Animal a) {
        // if there is a method only define in child class, polymorphic method can call it.
        // a1.catchMouse()  this method cannot be called.
        // but we can use type cast to solve the problem.
        // we need to use instanceof first before cast.
        if (a instanceof Dog a1) {
            a1.guardDoor();
        } else if (a instanceof Cat a1) {
            a1.catchMouse();
        }
    }
}
