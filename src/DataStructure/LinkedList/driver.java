package src.DataStructure.LinkedList;

public class driver {
    public static void main(String[] args) {
        LinkList<Integer> test = new LinkList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        System.out.println("Length = " + test.getLength());
        test.print();
        System.out.println("Index of 5 = ");
        System.out.println("Deleted 3: " + test.delete(3));
        System.out.println("Length = " + test.getLength());
        test.print();
        System.out.println("Deleted 5: " + test.delete(5));
        System.out.println("Length = " + test.getLength());
        test.print();
        System.out.println("Deleted 1: " + test.delete(1));
        System.out.println("Length = " + test.getLength());
        test.print();

    }
}
