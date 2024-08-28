package src.ExtendsUse;

public class Student extends People {
    private double grade;

    public static int studentCount = 0;

    public Student() {
        super(); // it will automatically be here, no matter you write it or not
    }

    public Student(String name, int age, char sex, double grade) {
/*       this.name = name;  way1: assign param one by one
         this.age = age;
         this.sex = sex;
*/
        super(name,age,sex); // way2: better way to call the father's constructor
        this.grade = grade;

    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
