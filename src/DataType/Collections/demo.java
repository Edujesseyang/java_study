package src.DataType.Collections;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        // addAll, adding multiple elements.
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(Collections.addAll(array1, 7, 8, 9));
        System.out.println(array1);

        // shuffle the list:
        List<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(array2);
        System.out.println(array2);

        // sort
        Collections.sort(array2);
        System.out.println(array2);
        // sort w/ comparator
        Collections.sort(array2, (o1, o2) -> o2 - o1);  // can be replaced by array2.sort(o1,o2)->o2-o1);
        System.out.println(array2);

        // sort hand-made classes;
        List<Student> studentList = new ArrayList<>(Arrays.asList(new Student("Jesse", 98.5), new Student("Klee", 87.5), new Student("Chloe", 89.3)));
        Collections.sort(studentList);
        System.out.println(studentList);

        // way 2: use the built-in comparator of sort method.
        Collections.sort(studentList, (o1, o2) -> (o2.getSocre() == o1.getSocre() ? 0 : (o2.getSocre() - o1.getSocre() > 0 ? 1 : -1)));
        System.out.println(studentList);
    }
}
