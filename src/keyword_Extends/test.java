package src.keyword_Extends;

public class test {
    public static void main(String[] args) {
        People p1 = new People("Jack", 23, 'M');
        Student s1 = new Student("Jesse", 35, 'M', 3.9);
        Teacher t1 = new Teacher("Shi", 69, 'M', 300000);
        Student s2 = new Student();
        CSTeacher c1 = new CSTeacher();

        System.out.println(People.getCount());
        System.out.println(c1.getSuperName());
        System.out.println(c1.getThisName());

        t1.teaching();
        System.out.println();
        c1.teaching();
        System.out.println();

        System.out.println(People.getCount());

        People p2 = new People("Wang");
        p2.printInfo();
        c1.printInfo();
        CSTeacher c2 = new CSTeacher("Lee", 43, 'M', 15000, "Java");
        c2.printInfo();

        System.out.println("People : " + People.getCount());
        System.out.println("Student: " + Student.getCount());
        System.out.println("Teacher: " + Teacher.getCount());
        System.out.println("CS teacher: " + CSTeacher.getCount());

        President president = President.getInstance();
        president.printInfo();

        President president1 = President.getInstance();
        System.out.println(president); // they have same address, no matter how many object we try to create, there is only one exists.
        System.out.println(president1);
    }
}
