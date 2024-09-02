package src.string;

public class Movie {
    private String name;
    private Double score;
    private String actor;

    public Movie() {
        System.out.println("Object created!");
    }

    public Movie(String name, Double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public String getActor() {
        return actor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + "\tScore: " + score + "\tActor: " + actor);
    }
}
