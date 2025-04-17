package src.OOP_Use.keyword_final.staticMemberVariable;

import static src.OOP_Use.keyword_final.staticMemberVariable.Person.personCount; // import the class.

public class test {
    // static member method belong to class. only access within the class
    public static void main(String[] args) {
        Person p1 = new Person("Tom", 23, 'M');
        Person p2 = new Person("John", 53, 'M');
        Person p3 = new Person("Jenny", 32, 'F');

        // get the value by using the name of the class itself.
        System.out.println("This are totally " + personCount + " people.");

        // to access the public static member, you have to import the class
        System.out.println(personCount);

        Person p4 = new Person("Lee", 42, 'M');
        System.out.println("This are totally " + personCount + " people.");

        // test.greeting();  ERROR, main method is static, greeting is non-static, you can not access non-static method
        // from static method inside the class.
        // To access this method, we have to instantiate the class to be an object.
        test t1 = new test();
        // then, we can access the non-static method via the object
        t1.greeting();

        // for static method, we can access directly from other static method within the class
        greeting1(); // static method

        // we can also access the static method and member variable via object, but not recommend
        t1.greeting1(); // NOT RECOMMEND
        // the best way is use the class name.method() to access the static method.
        test.greeting1(); // it same as greeting1(); b/c in a same class, you don't have to put test in the front.

        // NOTE: no "this" keyword in static method.
    }

    // non-static method, can be access only from outside the class
    public void greeting(){
        System.out.println("hello,world");
    }
    public static void greeting1(){
        System.out.println("hello,world");
    }


}
