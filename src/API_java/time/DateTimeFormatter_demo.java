package src.API_java.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_demo {
    public static void main(String[] args) {
        // create a new instance.
        LocalDateTime ldt = LocalDateTime.now();

        // create a new format
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEE MM/dd/yyyy (HH:mm:ss)");

        // both ways work:
        System.out.println(format1.format(ldt));
        System.out.println(ldt.format(format1));

        // parse String:
        String timeStr = "Thu 06/16/1988 (22:36:18)"; // Note: Thu has to match 06/16/1988
        LocalDateTime myDate = LocalDateTime.parse(timeStr, format1);
        System.out.println(myDate);

    }
}
