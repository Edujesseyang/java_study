package src.Collection;

public class Movie {
    private String name;
    private int year;
    private String director;
    private double score;

    public Movie() {
    }

    public Movie(String name, int year, String director, double score) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", score=" + score +
                '}';
    }
}
