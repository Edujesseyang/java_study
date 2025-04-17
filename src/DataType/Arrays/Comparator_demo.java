package src.DataType.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_demo {
    public static void main(String[] args) {

        Integer[] arr = {5, 2, 3, 6, 9, 8, 1, 7, 4, 0, 10, 19, 16, 15, 17, 18, 14, 12, 13, 20};

        // use comparator;

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /**
                 * @param 1 target array.
                 *        2 Comparator<Integer>

                rule: if o1 > o2; return positive, means 1,2,3,4,5 order;
                if o1 < o2; return negative, means 5,4,3,2,1 order;
                if o1 == o2; return 0;
                 */

                // return o1 - o2 // 1,2,3,4,5
                return o2 - o1;   // 5,4,3,2,1
            }
        });
        System.out.println(Arrays.toString(arr));


        // for Student[] array
        // 1. create a student array;
        Student s1 = new Student("Jesse", 36, 86.8);
        Student s2 = new Student("Lucky", 39, 86.9);
        Student s3 = new Student("Sushi", 28, 72.3);
        Student s4 = new Student("Klee", 45, 9.2);
        Student s5 = new Student("Cookie", 7, 90.3);
        Student[] students = {s1, s2, s3, s4, s5};
        for (Student s : students) {
            s.printInfo();
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("*********** After sorting by age *********************");
        for (Student s : students) {
            s.printInfo();
        }

        Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
//                        return (int) ((o2.getScore() - o1.getScore()) * 1000); // works. but
                        return Double.compare(o2.getScore(), o1.getScore());  // better
                    }
                }

        );
        System.out.println("*********** After sorting by score *********************");
        for (Student s : students) {
            System.out.println(s.toString());
        }

    }
}
