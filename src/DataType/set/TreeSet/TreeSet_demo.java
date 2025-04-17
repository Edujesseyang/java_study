package src.DataType.set.TreeSet;

import java.util.*;

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
        System.out.println("************************************************");

        // TreeSet for string elements, it will put them in alphabetical order.
        Set<String> set2 = new TreeSet<>(Arrays.asList("Java", "Python", "C++", "Javascript", "CSS", "HTML"));
        set2.forEach(s -> System.out.print(s + ", "));
        System.out.println();
        System.out.println("************************************************");

        // for hand-make class, TreeSet will not be able to sort w/o overriding compareTo methode.
        Set<Teacher> set3 = new TreeSet<>();
        set3.add(new Teacher("Jesse", 35, 'M'));
        set3.add(new Teacher("Mike", 36, 'M'));
        set3.add(new Teacher("Jerry", 45, 'M'));
        set3.add(new Teacher("Tony", 32, 'M'));
        set3.add(new Teacher("Jim", 36, 'M'));  // If the compareTo method returns 0; same age will be deleted.

        // way 1:
        // for tree Set, you have to set the comparable rule.
        set3.forEach(e -> System.out.println(e.toString()));
        System.out.println("************************************************");

        // way 2:
        // use the comparator
        Set<House> houseSet = new TreeSet<>((o1, o2) -> o1.getPrice() == o2.getPrice() ? 1 : o1.getPrice() - o2.getPrice());
        houseSet.add(new House("1430 Main St", 1600, 560000));
        houseSet.add(new House("23 Indian Ave", 4050, 1240000));
        houseSet.add(new House("850 Smart Pk", 1400, 983000));
        houseSet.add(new House("202 Abrams Road, Apt 304", 700, 215000));
        houseSet.add(new House("594 Roosevelt Blvd, Suit A", 3640, 875000));
        houseSet.add(new House("202 Abrams Road, Apt 305", 700, 215000));
        houseSet.forEach(e -> System.out.println(e.toString()));
        System.out.println("************************************************");

        // use the comparator w/o lambda:
        Set<Student> studentSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (Objects.equals(o1.getScore(), o2.getScore())) {
                    // add checking if name and score both are same. we consider that case is duplicate elements.
                    if (o1.getName().equals(o2.getName())) {
                        // return 0, allow TreeSet to delete this duplicate element.
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return (o1.getScore() - o2.getScore() < 0) ? 1 : -1;
                }
            }
        });
        studentSet.add(new Student("Jesse", 95.2));
        studentSet.add(new Student("Jim", 56.1));
        studentSet.add(new Student("Mike", 68.8));
        studentSet.add(new Student("Lee", 98.8));
        studentSet.add(new Student("John", 45.3));
        studentSet.add(new Student("Wendy", 100.0));
        studentSet.add(new Student("Penny", 26.3));
        studentSet.add(new Student("zoey", 100.0));
        studentSet.add(new Student("zoey", 100.0));  // it will be deleted by comparator.
        studentSet.forEach(e -> System.out.println(e.toString()));

    }
}
