package src.DataStructure;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        // stack: LIFO - last in, first out.

        // queue: FIFO - first in, first out.

        // Array: ordered, elements laid next to each other. Find an element by index is fast. Remove or insert an element is slow.

        // LinkedList: address/data pair, find an element is slow, remove/insert is fast.

        // tree: fast finding element. fast remove/insert element.

        // two types of lists:
        // 1: ArrayList: based on the array technic.
        // 2: LinkedList: based on the double ends linked list technic
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(1);
        myList.add(2);
        myList.add(0, 0);
        myList.remove(1);
        System.out.println(myList);

        // .get(index):
        int num = myList.get(0);
        System.out.println(num);
        System.out.println(myList);

        // .set(index, element):
        myList.set(2, 3);
        System.out.println(myList);
        // The different between List and Collection is List works with index, Collection dose not.

        // 4 ways of iteration:
        // 1: iterator
        Iterator<Integer> i = myList.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        // 2: forEach and lambda
        myList.forEach(aNum -> System.out.print(aNum + " "));
        System.out.println();
        // 3: foreach loop
        for (Integer integer : myList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        // 4: for loop
        for (int i1 = 0; i1 < myList.size(); i1++) {
            System.out.print(myList.get(i1) + " ");
        }
        System.out.println();


        // linkedList: modifies the head and tail is very fast.
        // linkedList can work as queue:
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);  // first in
        queue.addLast(2);
        queue.addLast(3);
        System.out.println(queue);
        System.out.println(queue.removeFirst());// first out
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        // linkedList work as stack:
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);  // last in
        System.out.println(stack);
        System.out.println(stack.removeLast());  // first out
        System.out.println(stack.removeLast());
        System.out.println(stack.removeLast());
        System.out.println(stack);
        // .addLast() is same as .push();
        // .removeLast() is same as .pop();


    }
}
