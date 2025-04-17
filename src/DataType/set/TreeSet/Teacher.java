package src.DataType.set.TreeSet;

import java.util.Objects;

public class Teacher implements Comparable<Teacher> {
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

    // override the compareTo method:
    @Override
    public int compareTo(Teacher o) {
        // return positive int, this > o
        // return negative int, this < o
        // return 0, equal, TreeSet will threaten them as same elements, then delete the second one.
        return (this.age - o.age) >= 0 ? 1 : -1;  // this will sort from small to large.
        // return (o.age - this.age);  // this will sort set from large to small
        // it can be:
        // if(this.age < o.age){
        //     return -1;
        // } else if (this.age >= o.age) {
        //     return 1;
        // }
        // If this method returns 0; it will delete the one of the elements, do not let it returns 0;
    }
}
