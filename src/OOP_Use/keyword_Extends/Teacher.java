package src.OOP_Use.keyword_Extends;

public class Teacher extends People {
    private double salary;

    public static int teacherCount = 0;

    public Teacher() {
        // super();  <-- we don't need to write this.
        teacherCount++;
    }

    public Teacher(String name, int age, char sex, double salary) {
        super(name, age, sex);  //  use father's constructor
        this.salary = salary;
        teacherCount++;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void teaching() {
        System.out.println("Show PPT...");
        System.out.println("Answer questions...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + this.salary);
    }

    public static int getCount(){
        return teacherCount;
    }
}
