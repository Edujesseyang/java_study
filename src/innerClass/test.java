package src.innerClass;

import src.innerClass.anonymousInnerClass.Animal;

public class test {
    public static void main(String[] args) {

        Car car1 = new Car("toyota", 2014);
        // to use inner static class:
        Car.Owner owner = new Car.Owner("John");
        Car.Owner otherOwner = new Car.Owner(("Lee"));
        owner.showInfo();
        otherOwner.showInfo();

        // to use public inner member class:
        Car.Tire t1 = car1.new Tire("Michelin", 23); // member class only can create by instance.
        t1.showInfo();
        Car.Tire t2 = new Car("Honda", 2013).new Tire("Periastron", 24);
        t2.showInfo();

        // But the private inner member class is not accessible from outside.
        // Car.engin e1 = car1.new Engin("V8", 4.0, 450);  this is not allowed.
        car1.checkEngin("V8", 4.0, 450);


        // local inner class
        class Dealer {
            private String name;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }
        }
        Dealer d = new Dealer();
        d.setName("Jesse");
        System.out.println("Dealer is " + d.getName());



    }
}
