package src.Usage_interface.JDK8NewFeature;

public class test {
    public static void main(String[] args) {
        myClass m1 = new myClass();  // can access the old ways method in the class.
        m1.someMethod();

        myClass m2 = new myClass();  // can access the default method in this way.
        m2.newMethod();

        m2.getMsg(); // call another default method who is using the private method.

        bluprint.staticMethod(); // can access the static method in this way.
    }


}
