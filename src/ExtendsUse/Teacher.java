package src.ExtendsUse;

public class Teacher extends People {
    private double salary;

    public static int teacherCount = 0;

    public Teacher() {

    }

    public Teacher(String name, int age, char sex, double salary) {
        super(name, age, sex);  // way2 : use father's constructor
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void teaching(){
        System.out.println("Show PPT...");
        System.out.println("Answer questions...");
    }
}
