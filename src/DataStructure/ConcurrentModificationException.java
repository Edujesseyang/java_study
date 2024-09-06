package src.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        /*
         To avoid the Error ConcurrentModificationException:
         We can choose the iterator.remove() or backward for loop to delete it. It is safe.
        */
        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        Iterator<Integer> numList_it = numList.iterator();
        while (numList_it.hasNext()) {
            int num = numList_it.next();
            boolean isComp = false;
            for (int i = 2; i < numList.size() - 1; i++) {
                if (num % i == 0) {
                    if (num != i) {
                        isComp = true;
                    }
                }
            }
            if (isComp) {
                numList_it.remove();  // if you use numList.remove()
                // ConcurrentModificationException Error will occur.
            }
        }
        System.out.println(numList);

        // "for each" loop; it cannot use it for looping and deleting at the same time.
        // forEach method and lambda cannot use it for looping and deleting at the same time.

        // use for loop, you can loop backward.
        List<Integer> numList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        for (int i = numList1.size() - 1; i >= 0; i--) {
            for (int j = 2; j < numList1.get(i); j++) {
                if (numList1.get(i) % j == 0) {
                    numList1.remove(i);
                    break;
                }
            }
        }
        System.out.println(numList1);
    }
}
