package src.OOP_Use.Genericity;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {

        // when use list, it is a good practice to use a genericity type.
        List unGereList = new ArrayList<>();  // bad practice, error risk.
        unGereList.add("23");
        unGereList.add(23);
        unGereList.add(2.3);
        System.out.println(unGereList);

        // use genericity list:
        List<String> gereList = new ArrayList<>();  // good practice.
        gereList.add("123");
        gereList.add("456");
        gereList.add("789");
        System.out.println(gereList);

        // if you need to have a mixed list:
        List<Object> gereList2 = new ArrayList<>();  // good practice.
        gereList2.add("23");
        gereList2.add(23);
        gereList2.add(2.3);
        System.out.println(gereList2);


        // use MyArrayList:
        MyArrayList<Integer> mlist = new MyArrayList<>();
        mlist.add(1);
        mlist.add(2);
        mlist.add(3);
        System.out.println(mlist);

        printAll(gereList2);
        printAll(gereList);
    }

    /**
     * generic method
     */
    public static <T> void printAll(List<T> arr) {
        System.out.print("[");
        arr.forEach(e -> {
            if (e instanceof String) {
                System.out.print("\"" + e + "\", ");
            } else {
                System.out.print(e + ", ");
            }
        });
        System.out.println("]");
    }
}
