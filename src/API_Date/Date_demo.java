package src.API_Date;

import java.util.Date;

public class Date_demo {
    public static void main(String[] args) {
        // 1. use Date constructor;
        Date d1 = new Date(); // get the current date and time;
        System.out.println(d1);

        // 2. get time in millis;
        long timeInMillis = d1.getTime();
        long timeInMillis2 = System.currentTimeMillis();
        System.out.println(timeInMillis);
        System.out.println(timeInMillis2);

        // 3. Date param-constructor: input time in millis, output time and date
        Date d2 = new Date(System.currentTimeMillis());
        System.out.println(d2);

        // 4. setTime(long time)
        long time = System.currentTimeMillis();
        time += (121 + 3600) * 1000;
        d2.setTime(time);
        System.out.println(d2);

    }
}
