package src.DataStructure.LinkedList;

public class driver {
    public static void main(String[] args) {
        LinkList<Integer> test = new LinkList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        test.print();
    }
}
