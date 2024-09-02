package src.keyword_Extends;

public class People {
    protected String name = "normal human";
    protected int age;
    protected char sex;
    public static int peopleCount;

    public People() {
        peopleCount++;
    }

    public People(String name) {
        this(name, 0, ' '); // brother constructor. only at the first line.
    }

    public People(int age) {
        this("Unknown", age, ' ');
    }

    public People(char sex) {
        this("unknown", 0, sex);
    }

    public People(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        peopleCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static int getCount() {
        return peopleCount;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
    }
}
