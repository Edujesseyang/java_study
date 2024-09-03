package src.API_Period;

import java.time.Duration;
import java.time.LocalDateTime;

public class Duration_demo {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime myBirth = LocalDateTime.of(1988, 6, 16, 22, 36, 18);

        Duration d = Duration.between(myBirth, now); // (before, after)
        System.out.println(d);

        System.out.println("I lived " + d.toDays() + " days\nor " + d.toHours() + " hours\nor " + d.toMinutes() + " minutes\nor " + d.toSeconds() + " seconds.");
    }
}
