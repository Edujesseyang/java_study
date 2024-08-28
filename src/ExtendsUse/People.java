package src.ExtendsUse;

public class People {
    protected String name = "normal human";
    protected int age;
    protected char sex;
    public static int peopleCount;

    public People() {
        peopleCount++;
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
}
