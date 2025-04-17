package src.API_Usage.API_Object.equals;


public class test {
    public static void main(String[] args) {

        People p1 = new People();
        People p2 = new People();

        // use equals in object API
        System.out.println(p1.equals(p2)); // it will be false, b/c equals compares the address.
        System.out.println(p1 == p2); // same as p1.equals(p2);

        // we can override equals method.
        Man m1 = new Man("Jesse", 43);
        Man m2 = new Man("Jesse", 43);
        System.out.println(m1.equals(m2)); // return true if they are the same.
        System.out.println(m1 == m2);
    }
}
