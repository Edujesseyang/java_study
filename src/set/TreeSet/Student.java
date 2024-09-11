package src.set.TreeSet;

public class Student {
    private String name;
    private Double score;

    public Student() {

    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public Double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nScore: " + this.score;
    }

}
