package src.ExtendsUse;

public class CSTeacher extends Teacher {
    private String language;
    private String name;
    public static int CSTeacherCount;

    public CSTeacher() {

    }

    public CSTeacher(String name, int age, char sex, double salary, String language) {
        super(name, age, sex, salary);
        this.language = language;
    }

    public void initName() {
        this.name = "Coding God";
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
}
