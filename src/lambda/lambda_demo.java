package src.lambda;

public class lambda_demo {
    public static void main(String[] args) {

        // format: (parameters) -> expression
        /* (params) -> {
            @override
            method...
         */

        // example without using lambda
        Animal a = new Animal() {
            {
                this.name = "Cat";
            }

            @Override
            public void run() {
                System.out.println(this.name + " is running...");
            }
        };
        a.run();

        // without using lambda
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("Swimming...");
            }
        };
        s.swim();

        // use lambda
        // need a FunctionalInterface with only one method inside.
        Swimming s1 = () -> System.out.println("Swimming in lambda...");
        s1.swim();

    }
}

abstract class Animal {
    public String name;

    public abstract void run();
}

@FunctionalInterface  // only allow one method in the interface.
interface Swimming {
    void swim();
}