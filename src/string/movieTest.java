package src.string;

import java.util.ArrayList;
import java.util.Scanner;

public class movieTest {
    public static void main(String[] args) {
        ArrayList<Movie> moviesList = new ArrayList<>();
        Movie m1 = new Movie("Wolf of the West", 8.5, "Jesse Yang");
        Movie m2 = new Movie("Cool Ass Fat Cat", 3.6, "Lucky");
        Movie m3 = new Movie("My Mama is good", 4.5, "Sushi");
        moviesList.add(m1);
        moviesList.add(m2);
        moviesList.add(m3);

        moviesList.add(new Movie("Fly whit Wind", 8.7, "Johnny Casey"));
        moviesList.add(new Movie("Okay, My darling!", 4.7, "Barbary Lilith"));
        moviesList.add(new Movie("My Fucking legs hurt", 1.7, "Bill 'Cow Boy' James"));
        for (Movie m : moviesList) {
            m.printInfo();
        }
        System.out.println("The best movie is: ");
        Movie bestMovie = findBest(moviesList);
        bestMovie.printInfo();

        try (Scanner sc = new Scanner(System.in)) {
            Movie myMovie = findMovie(moviesList, sc);
            if (myMovie != null) {
                myMovie.printInfo();
            }
        }
    }

    public static Movie findBest(ArrayList<Movie> movieList) {
        Double maxScore = movieList.get(0).getScore();
        for (Movie movie : movieList) {
            if (movie.getScore() > maxScore) {
                maxScore = movie.getScore();
            }
        }
        for (Movie m : movieList) {
            if (m.getScore().equals(maxScore)) {
                return m;
            }
        }
        return movieList.get(0);
    }

    public static Movie findMovie(ArrayList<Movie> moviesList, Scanner sc) {
        while (true) {
            System.out.println("Enter the name of the movie(-1 to exit): ");
            String name = sc.nextLine();
            if (name.equals("-1")) {
                return null;
            }
            for (Movie m : moviesList) {
                if (m.getName().equals(name)) {
                    return m;
                }
            }
            System.out.println("Not found");
        }
    }

}