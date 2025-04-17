package src.API_Usage.API_ChronoUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnit_demo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime mybday = LocalDateTime.of(1988, 6, 16, 22, 36, 18);

        System.out.println("I lived " + ChronoUnit.YEARS.between(mybday, now) + " years.");
        System.out.println("I lived " + ChronoUnit.MONTHS.between(mybday, now) + " months.");
        System.out.println("I lived " + ChronoUnit.DAYS.between(mybday, now) + " days.");
        System.out.println("I lived " + ChronoUnit.HOURS.between(mybday, now) + " hours.");
        System.out.println("I lived " + ChronoUnit.MINUTES.between(mybday, now) + " minutes.");
        System.out.println("I lived " + ChronoUnit.SECONDS.between(mybday, now) + " second.");
        System.out.println("I lived " + ChronoUnit.MILLIS.between(mybday, now) + " millis.");
        System.out.println("I lived " + ChronoUnit.NANOS.between(mybday, now) + " Nanos.");

    }
}
