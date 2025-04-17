package src.API_Usage.API_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseException_demo {
    public static void main(String[] args) {

        //  parse exception:
        String date = "06/16/2023; 23:15:26";
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy; HH:mm:ss");
        try {
            Date d1 = format.parse(date);
            System.out.println(d1);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
