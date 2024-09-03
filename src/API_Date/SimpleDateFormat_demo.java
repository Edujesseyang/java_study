package src.API_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_demo {
    public static void main(String[] args) throws ParseException, InterruptedException {
        // Usage: formating date into a human-readable format
        Date d1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy EEE \na HH : mm : ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日\nHH时mm分ss秒\n");
        /*  MM: month
            dd: date
            yyyy: year
            EEE: day in week
            a: AM/PM
            HH: hour
            mm: minutes
            ss: second
        */
        String str_d1 = format1.format(d1);
        System.out.println(str_d1);
        System.out.println(format2.format(d1));

        // we can also input the time in millis:
        System.out.println(format1.format(System.currentTimeMillis()));


        // parse string with time and date:
        String time_str = "2021年08月06日 11:11:11";
        System.out.println("Current time: " + time_str);

        SimpleDateFormat format3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = format3.parse(time_str);

        long time = date.getTime();
        date.setTime(time + (120L * 1000)); // add L to make sure all numbers calculate as long types.

        System.out.println("After 2 minutes: " + format3.format(date));


        // user the checkTime method;
        String schoolTime = "09/03/2024 10:30:00";
        String myTime = "09/03/2024 10:31:00";
        System.out.println("Am I on time? " + checkOnTime(schoolTime, myTime));

    }

    public static boolean checkOnTime(String targetTime, String userTime) throws ParseException {
        SimpleDateFormat timeForm = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date targetDate = timeForm.parse(targetTime);
        long targetMil = targetDate.getTime();
        Date userDate = timeForm.parse(userTime);
        long userMil = userDate.getTime();
        return targetMil >= userMil;
    }
}
