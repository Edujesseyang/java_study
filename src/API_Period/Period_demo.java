package src.API_Period;

import java.time.LocalDate;

import java.time.Period;

public class Period_demo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate myBday = LocalDate.of(1988, 6, 16);

        Period p = Period.between(myBday, today);
        System.out.println(p);
        System.out.println("I lived " + p.getYears() + " years " + p.getMonths() + " month, and " + p.getDays() + " days.");

    }
}
