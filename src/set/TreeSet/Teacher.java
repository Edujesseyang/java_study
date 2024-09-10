package src.set.TreeSet;

import java.util.Objects;

public class Teacher {
    private String name;
    private int age;
    private char sex;

    public Teacher() {
    }

    public Teacher(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return this.sex;
    }

    @Override
    public String toString() {
        return "Object{" + this.name + " -- Age: " + this.age + ", Gender: " + this.sex + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Teacher t = (Teacher) o;
        return Objects.equals(t.name, this.name) &&
                Objects.equals(t.age, this.age) &&
                Objects.equals(t.sex, this.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age, this.sex);
    }

    @Override
    public void Comparable(){}


}
