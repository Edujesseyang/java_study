package src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_API {
    public static void main(String[] args) {

        Collection<String> myList = new ArrayList<>();
        // .add(): add elements
        myList.add("How");
        myList.add("are");
        myList.add("you");
        myList.add("bro");
        System.out.println(myList);

        // copy list
        Collection<String> myList1;
        myList1 = myList;
        myList1.add("?");
        System.out.println(myList1);

        // .add() element return boolean if add successful or not
        boolean isAdded = myList.add("?");
        System.out.println("Is added? " + isAdded);

        // .equals() : return boolean if two lists are equal
        System.out.println("Are they equal? " + myList1.equals(myList));
        // always true, b/c the copy is address copy. myList and myList1 both are pointing the same memory location.

        // .clear(): empty the list;
        myList.clear();
        System.out.println(myList);

        // .isEmpty(): check if the list is empty;
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is list 1 empty now? " + isEmpty);
        System.out.println("Is list 2 empty now? " + myList1.isEmpty());
        // both are empty now, because "=" copy is copy the address, not the object itself.

        // delete element:
        myList.add("Something");
        myList.add("Something1");
        myList.add("Something2");
        boolean isRemoved = myList.remove("Something");  // can only remove by value, not index.
        System.out.println(myList + "\nIs removed? " + isRemoved);
        boolean isRemoved2 = myList.remove("SOMETHING");  // can only remove by value, not index.
        System.out.println(myList + "\nIs removed? " + isRemoved2);

        // .addAll(list) : add all element into another list.
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(1);
        c1.add(2);
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(3);
        c2.add(4);
        c1.addAll(c2);
        System.out.println(c1);
    }
}
