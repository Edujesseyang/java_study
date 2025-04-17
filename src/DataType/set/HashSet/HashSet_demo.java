package src.DataType.set.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_demo {
    public static void main(String[] args) {

        // orderless, non-repeat, non-index.
        Set<String> mySet = new HashSet<>();
        mySet.add("Java");
        mySet.add("HTML");
        mySet.add("MySql");
        mySet.add("Java");
        System.out.println(mySet);

        // ordered, non-repeat, non-index.
        Set<String> mySet1 = new LinkedHashSet<>();
        mySet1.add("Java");
        mySet1.add("HTML");
        mySet1.add("MySql");
        mySet1.add("Java");
        System.out.println(mySet1);

        // can be sorted, non-repeat, non-index.
        Set<String> mySet2 = new TreeSet<>();
        mySet2.add("Java");
        mySet2.add("HTML");
        mySet2.add("MySql");
        mySet2.add("Java");
        System.out.println(mySet2);

        // get hashCode:
        int hashCode = mySet.hashCode();
        System.out.println(hashCode);
        // every object has a hashCode:
        String aString = "I have a code";
        System.out.println(aString.hashCode());

        // Student set:
        Set<Student> studentList = new HashSet<>();
        studentList.add(new Student("Jesse", 35, 95.6));
        studentList.add(new Student("Chloe", 34, 94.6));
        studentList.add(new Student("Cookie", 3, 15.6));
        studentList.add(new Student("Lucky", 5, 24.2));
        studentList.add(new Student("Lucky", 5, 24.2));
        studentList.forEach(s -> System.out.println(s.toString()));
        // this will not kick off the same object, because the hashcode are different


        // after override the equals method and hashcode method, it will take out the repeated elements.


    }
}
