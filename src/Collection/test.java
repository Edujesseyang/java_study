package src.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        Movie m1 = new Movie("Gun", 2003, "Lucky", 8.6);
        Movie m2 = new Movie("Cat's life", 1966, "Sushi", 9.5);
        Movie m3 = new Movie("Baby Cat", 2023, "Cookie", 3.6);
        Collection<Movie> playList = new ArrayList<>(Arrays.asList(m1, m2, m3));

        playList.forEach(m -> System.out.println(m.toString()));

        double sum = 0.0;
        for (Movie m : playList) {
            sum += m.getScore();
        }
        double avgScore = Math.round((sum / playList.size()) * 100) / 100.0;
        System.out.println("Avg score of the playlist: " + avgScore);


    }
}
