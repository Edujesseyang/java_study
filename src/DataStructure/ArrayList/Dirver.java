package src.DataStructure.ArrayList;

class Dirver {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>(String.class);

        // 1. Add elements
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        print("Add 3 elements", list.length(), 3);

        // 2. elementAt()
        print("Element at index 1", list.elementAt(1), "banana");

        // 3. contains()
        print("Contains 'banana'", list.contains("banana"), true);
        print("Contains 'date'", list.contains("date"), false);

        // 4. delete()
        print("Delete 'banana'", list.delete("banana"), true);
        print("Contains 'banana' after delete", list.contains("banana"), false);
        print("Length after delete", list.length(), 2);

        // 5. remove(index)
        list.remove(0);  // remove 'apple'
        print("First element after remove(0)", list.elementAt(0), "cherry");
        print("Length after remove", list.length(), 1);

        // 6. delete() non-existent
        print("Delete 'banana' again (not exists)", list.delete("banana"), false);

        // 7. remove(index) out of bounds
        try {
            list.remove(5);
            System.out.println("Remove out-of-bounds: FAILED (no exception thrown)");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Remove out-of-bounds: PASSED (exception thrown)");
        }

        // 8. delete null value
        list.add(null);
        print("Contains null", list.contains(null), true);
        print("Delete null", list.delete(null), true);
        print("Contains null after delete", list.contains(null), false);
    }

    private static <T> void print(String testName, T actual, T expected) {
        boolean pass = (actual == null ? expected == null : actual.equals(expected));
        System.out.printf("Testing %-35s | Output: %-10s | Expected: %-10s | %s\n",
                testName, actual, expected, pass ? "PASSED" : "FAILED");
    }
}