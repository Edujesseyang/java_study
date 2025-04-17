package src.OOP_Use.keyword_Extends;

public class Student extends People {
    private double grade;

    public static int studentCount = 0;

    public Student() {
        super(); // it will automatically be here, no matter you write it or not
        studentCount++;
    }

    public Student(String name, int age, char sex, double grade) {
        super(name, age, sex); // call the father's constructor, only at the first line.
        this.grade = grade;
        studentCount++;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Grade: " + this.grade);
    }

    public static int getCount() {
        return studentCount;
    }
}
