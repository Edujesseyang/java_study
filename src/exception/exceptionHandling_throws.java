package src.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exceptionHandling_throws {

    // use throws to throw out error to upper level,
    // this method will still pop error if there is one, but it won't pop error before it running.
    // normally throws master class - Exception.
    public static void main(String[] args) throws Exception { // throw out error to upper level
        String target = "06/26/2023 22:15:23";
        Date result = parseTime(target);
        System.out.println(result);
    }

    public static Date parseTime(String dateString) throws Exception { // throw out error to upper level
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return format.parse(dateString);
    }
}
