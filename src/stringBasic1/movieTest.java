package src.stringBasic1;

import java.util.ArrayList;

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
    }
}
