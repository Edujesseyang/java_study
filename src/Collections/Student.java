package src.Collections;

public class Student implements Comparable<Student> {
    private String name;
    private double socre;

    public Student() {

    }

    public Student(String name, double socre) {
        this.name = name;
        this.socre = socre;
    }

    public String getName() {
        return this.name;
    }

    public double getSocre() {
        return this.socre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.socre;
    }


    @Override
    public int compareTo(Student o) {
        return (this.socre == o.getSocre()) ? 0 : ((this.socre - o.getSocre() > 0) ? 1 : -1);
    }
}
