package src.API_Date;

import java.util.Calendar;
import java.util.Date;

public class Calendar_demo {
    public static void main(String[] args) {
        // The class calendar is an abstract class. You cannot implement it directly.
        // use getInstance() to create object
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // int get(int field);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        // ...

        // void set(int field, int value);
        // cal.set(Calendar.HOUR_OF_DAY, 15); // normally we don't want to set.
        // ...

        // void add(int field, int amount);
        cal.add(Calendar.HOUR_OF_DAY, 3); // add 3 hours on the time.

        // Date getTime();
        Date newDate = cal.getTime();

        // long getTimeInMillis();
        long millis = cal.getTimeInMillis();



    }


}
