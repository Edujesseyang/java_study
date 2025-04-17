package src.OOP_Use.keyword_Extends;

public class CSTeacher extends Teacher {
    private String language;
    private final String name;
    public static int CSTeacherCount;

    {
        this.name = "Coding God";
    }

    public CSTeacher() {
        CSTeacherCount++;
    }

    public CSTeacher(String name, int age, char sex, double salary, String language) {
        super(name, age, sex, salary);
        this.language = language;
        CSTeacherCount++;
    }

    public String getThisName() {
        return this.name;
    }

    public String getSuperName() {
        return super.name;
    }

    @Override
    public void teaching() {
        super.teaching();
        System.out.println("Coding...");

    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + super.age);
        System.out.println("Sex: " + super.sex);
        System.out.println("Salary: " + super.getSalary());
        System.out.println("Language: " + this.language);
    }

    public static int getCount() {
        return CSTeacherCount;
    }
}
