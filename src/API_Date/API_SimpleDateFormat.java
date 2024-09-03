package src.API_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class API_SimpleDateFormat {
    public static void main(String[] args) {
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
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = null;
        try {
            date = format3.parse(time_str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace(); //FIXME
        }
    }
}
