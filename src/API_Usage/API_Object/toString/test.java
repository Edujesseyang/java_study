package src.API_Usage.API_Object.toString;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("Jesse", 35);
        // public String toString()
        // this method return address string of any object.
        String s1_address = s1.toString();
        System.out.println(s1_address);
        System.out.println(s1); // it will be same as s1.toString();

        // we can override toString();
        Teacher t1 = new Teacher("Lucky", 5);
        System.out.println(t1);

    }
}
