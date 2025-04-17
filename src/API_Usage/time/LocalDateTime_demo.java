package src.API_Usage.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

public class LocalDateTime_demo {
    public static void main(String[] args) {

        // get a local time in the form of HH:mm:ss.......
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        // get hour/minutes/second
        int hour = time1.getHour();
        int min = time1.getMinute();
        int sec = time1.getSecond();
        System.out.println("Current time is " + hour + ":" + min + ":" + sec);

        // get a local date in the form of yyyy-MM-dd
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        // get month/year/day of the month
        int year = date1.getYear();
        int month = date1.getMonthValue();
        int day = date1.getDayOfMonth();
        System.out.println("Today is " + month + "/" + day + "/" + year);

        // get a local date and time together
        LocalDateTime dateTime1 = LocalDateTime.now();
        // convert LocalDate of LocalTime
        LocalDate theDate1 = dateTime1.toLocalDate();
        LocalTime theTime1 = dateTime1.toLocalTime();
        System.out.println(theDate1);
        System.out.println(theTime1);

        // add time or date: can use chaining.
        LocalTime newTime1 = theTime1.plusHours(1).plusMinutes(15).plusSeconds(26);
        LocalDate newDate1 = theDate1.minusYears(3).minusMonths(4).minusDays(15);
        System.out.println(newDate1);
        System.out.println(newTime1);

        // use checkBDay();
        System.out.println("Is today my birth day? " + checkBDay(9, 3));

        // use MonthDay class in form of "--MM-dd"
        MonthDay nowMonthDay = MonthDay.of(5, 4);
        System.out.println(nowMonthDay);
    }

    public static boolean checkBDay(int month, int day) {
        // MonthDay class only have month and day information.
        MonthDay today = MonthDay.now();
        int currentMonth = today.getMonthValue();
        int currentDay = today.getDayOfMonth();
        return day == currentDay && month == currentMonth;
    }
}
