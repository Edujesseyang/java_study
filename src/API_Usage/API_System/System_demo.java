package src.API_Usage.API_System;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class System_demo {
    public static void main(String[] args) {

        // terminate JVM : System.exit(code);   code = 0: normal terminating   code != 0: error
        // System.exit(0);  **be careful**

        // get current time in millis from 1970/1/1 0:00:
        long time = System.currentTimeMillis();
        System.out.println(time);
        // convert it to second:
        long time_second = time / 1000;
        System.out.println(time_second);
        // convert it to minutes:
        long time_min = time_second / 60;
        System.out.println(time_min);
        // convert it to hours:
        long time_hour = time_min / 60;
        System.out.println(time_hour);
        // convert it to days:
        long time_day = time_hour / 24;
        System.out.println(time_day);
        // convert it to year:
        long time_year = time_day / 365;
        System.out.println(time_year);
        System.out.println("Current year is " + (time_year + 1970));


        // array copy
        int[] a1 = {11, 22, 33, 44, 55, 66};
        int[] a2 = new int[6]; // it is {0, 0, 0, 0, 0, 0}
        // we want a copy version like {0, 0, 44, 55, 66, 0}
        // arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        System.arraycopy(a1, 3, a2, 2, 3);
        for (int i : a2) {
            System.out.print(i + ", ");
        }
        System.out.println();


        // bigDecimal;
        // use bigDecimal for the solving the decimal precision issues.
        // best practice, use param constructor with a string type of input to be sure there is nothing else after the decimal num we want.
        // recommend way 1: input is string
        BigDecimal trueNum = new BigDecimal("1.0022356");
        System.out.println(trueNum);
        // recommend way 2: input is double or long
        BigDecimal trueNum2 = BigDecimal.valueOf(1.0022357);
        System.out.println(trueNum2);

        // example:
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); // 3.00000000000000004   (bad precision)
        // use BigDecimal:
        BigDecimal big_a = new BigDecimal("0.1");
        BigDecimal big_b = BigDecimal.valueOf(0.2);
        System.out.println(big_a.add(big_b));  // 0.3 (good precision)
        System.out.println(big_a.subtract(big_b));
        System.out.println(big_a.multiply(big_b));
        // for division, we need more param, scale and rounding mode.
        System.out.println(big_a.divide(big_b, 2, RoundingMode.HALF_EVEN));

        double doubleAdd = big_a.add(big_b).doubleValue(); // convert it to double;
        System.out.println(doubleAdd + 0.5);  // we can use it with double


    }
}
