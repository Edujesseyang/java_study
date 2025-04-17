package src.OOP_Use.keyword_abstract;

public class TEST {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setSide();
        t1.getSide();

        Triangle t2 = new Triangle(3, 3);
        System.out.println(t2.getArea());

        // Shape s1 = new Shape();   ERROR
        // abstract class cannot be instanced.
    }
}
