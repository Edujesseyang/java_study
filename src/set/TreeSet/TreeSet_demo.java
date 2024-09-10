package src.set.TreeSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_demo {
    public static void main(String[] args) {

        // tree is ordered for int and double;
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set1.add(8);
        System.out.print("[");
        set1.forEach(s -> System.out.print(s + ", "));
        System.out.println("]");

        // TreeSet for string elements, it will put them in alphabetical order.
        Set<String> set2 = new TreeSet<>(Arrays.asList("Java", "Python", "C++", "Javascript", "CSS", "HTML"));
        set2.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // for hand-make class, TreeSet will not be able to sort.
        Set<Teacher> set3 = new TreeSet<>();


    }
}
