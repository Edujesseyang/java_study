package src.DataStructure.LinkedList;

class driver {
    public static void main(String[] args) {
        // test constructor and add
        LinkList<Integer> test = new LinkList<>(Integer.class);
        System.out.println("******** Integer test ********");
        System.out.println("=== Add Test ===");
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        System.out.println("LinkList constructed successfully");
        test.print(); // 0, 1, 2, 3, 4

        // test delete and indexOf
        System.out.println("Length = " + test.getLength());
        System.out.println("Index of 4 = " + test.indexOf(4));
        System.out.println("\nDeleted 3: " + test.delete(3));
        test.print(); // 0, 1, 2, 3,
        System.out.println("Length = " + test.getLength());
        System.out.println("Index of 4 = " + test.indexOf(4));

        System.out.println("\nDeleted 5: " + test.delete(5));
        test.print();
        System.out.println("Length = " + test.getLength());
        System.out.println("Index of 5 = " + test.indexOf(5));

        System.out.println("\nDeleted 1: " + test.delete(1));
        test.print();
        System.out.println("Length = " + test.getLength());
        System.out.println("Index of 1 = " + test.indexOf(1));

        // refill elements
        System.out.println("\nAdd: 0 , 1, 2, 3, 4");
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.print();

        // test reverse
        System.out.println("\nTest reverseList: ");
        test.reverseList();
        test.print();

        // test print index, insert by index, and removeAt by index
        System.out.println("\nPrint index pairs ...");
        test.printIndex();
        System.out.println("\nInsert: index = 4, value = 200");
        test.insert(4, 200);
        test.printIndex();
        System.out.println("\nRemove: index = 4");
        test.removeAt(4);
        test.printIndex();
        test.print();

        // test removeAll(val)
        System.out.println("After remove all 2");
        test.removeAll(2);
        test.print();
        System.out.println("After remove all 4");
        test.removeAll(4);
        test.print();

        // test toString()
        String testString = test.convertToString();
        System.out.println("toString: " + testString);


        LinkList<String> list = new LinkList<>(String.class);
        System.out.println("\n\n******** String test ********");
        System.out.println("=== Add Test ===");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.print();            // {Apple, Banana, Cherry, }
        list.printIndex();       // [(0): Apple, (1): Banana, (2): Cherry, ]

        System.out.println("\n=== Insert Test ===");
        list.insert(1, "Blueberry");
        list.print();            // {Apple, Blueberry, Banana, Cherry, }
        list.printIndex();       // [(0): Apple, (1): Blueberry, (2): Banana, (3): Cherry, ]

        System.out.println("\n=== Get Test ===");
        System.out.println("Element at index 2: " + list.get(2)); // Banana

        System.out.println("\n=== IndexOf Test ===");
        System.out.println("Index of Cherry: " + list.indexOf("Cherry")); // 3
        System.out.println("Index of Mango: " + list.indexOf("Mango"));   // -1

        System.out.println("\n=== Delete Test ===");
        list.print();
        System.out.println("Delete: 'Banana'");
        list.delete("Banana");
        list.print();            // {Apple, Blueberry, Cherry, }
        list.printIndex();       // [(0): Apple, (1): Blueberry, (2): Cherry, ]

        System.out.println("\n=== RemoveAt Test ===");
        list.print();
        System.out.println("Remove: index 1");
        list.removeAt(1);        // remove "Blueberry"
        list.print();            // {Apple, Cherry, }
        list.printIndex();       // [(0): Apple, (1): Cherry, ]

        System.out.println("\n=== Insert at Head and Tail Test ===");
        list.insert(0, "First");
        list.insert(list.getLength(), "Last");
        list.print();            // {First, Apple, Cherry, Last, }
        list.printIndex();       // [(0): First, (1): Apple, (2): Cherry, (3): Last, ]

        System.out.println("\n=== toArray Test ===");
        String[] arr = list.toArray();
        System.out.println("Array: " + java.util.Arrays.toString(arr));  // [First, Apple, Cherry, Last]

        // test toString()
        String listString = list.convertToString();
        System.out.println("toString: " + listString);
    }
}
