package src.API_Usage.time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Instant_demo {
    public static void main(String[] args) {

        // use Instant class to get time stamp.
        Instant timeStamp = Instant.now(); // this will get greenwich time(GMT).
        System.out.println(timeStamp);

        // convert it to systemDefault timezone.
        System.out.println(timeStamp.atZone(ZoneId.systemDefault()));

        // convert it to a Date object
        Date date1 = Date.from(timeStamp);
        System.out.println(date1);

        // convert it back to Instant
        Instant timeStamp2 = date1.toInstant();
        System.out.println(timeStamp2);


    }
}
