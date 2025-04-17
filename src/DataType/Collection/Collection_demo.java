package src.DataType.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collection_demo {
    /*
                          ArrayList    : Ordered, duplicate allowed, with index.
                   List < LinkedList   : Ordered, duplicate allowed, with index.
      Collection <
                   Set  < HashSet      : Not ordered, duplicate not allow, no index.
                          TreeSet      : Not ordered, duplicate not allow, no index.

                 * Set - HashSet - LinkedHashSet : Ordered, duplicate not allow, no index.
     */
    public static void main(String[] args) {
        // ArrayList: Ordered, duplicate allowed, with index.
        Collection<Object> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("34");
        list.add(34);
        list.add(2.33);
        list.add(false);
        System.out.println(list);

        // HashSet: Not ordered, duplicate not allow, no index.
        Collection<Object> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("34");
        set.add(34);
        set.add(2.33);
        set.add(false);
        System.out.println(set);

        // type fixed list/set:
        Collection<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        System.out.println(intList);

        Collection<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(1);
        intSet.add(2);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3);
        System.out.println(intSet);

    }


}
