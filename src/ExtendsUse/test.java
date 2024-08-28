package src.ExtendsUse;

import src.pokerGame.Player;

public class test {
    public static void main(String[] args) {
        People p1 = new People("Jack", 23, 'M');
        Student s1 = new Student("Jesse", 35, 'M', 3.9);
        Teacher t1 = new Teacher("Shi", 69, 'M', 300000);
        Student s2 = new Student();
        CSTeacher c1 = new CSTeacher();
        c1.initName();

        System.out.println(People.getCount());
        System.out.println(c1.getSuperName());
        System.out.println(c1.getThisName());

        t1.teaching();
        System.out.println();
        c1.teaching();
        System.out.println();


    }
}
