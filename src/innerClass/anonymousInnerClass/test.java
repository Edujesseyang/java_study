package src.innerClass.anonymousInnerClass;

public class test {
    public static void main(String[] args) {
        // anonymous inner class
        // format:
        // new class| abstract name | or interface name () {
        //    ...override method...
        // }
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("I am running...");
            }
        };
        // here "a" is not an object of Animal. it is an object without naming.
        a.run();
        // we use anonymous inner class to create an object quickly.


        // use anonymous inner class for interface.
        Production p = new Production() {
            public final String name = "Tiger";

            public String getName() {
                return this.name;
            }

            @Override
            public void produce() {
                System.out.println(" having a baby...");
            }
        };
        makeProduction(p);
        // p is NOT an object of interface.
        // it is an object of the anonymous inner class of interface.

        // another example:
        Production p1 = new Production() {
            final String name = "Dog";

            @Override
            public String getName() {
                return this.name;
            }

            @Override
            public void produce() {
                System.out.println(" have 4 babies.");
            }
        };
        makeProduction(p1);

    }

    public static void makeProduction(Production a) {
        System.out.print(a.getName());
        a.produce();
    }
}
