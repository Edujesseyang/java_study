package src.OOP_Use.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logging {

    // create a logback object:
    public static final Logger LOGGER = LoggerFactory.getLogger(("logging.class"));

    public static void main(String[] args) {
        //
        try {
            LOGGER.debug("Start logging...");
            LOGGER.info("This is an info...");
            LOGGER.warn("BE CAREFUL!");
            LOGGER.error("Here is an error");
            int a = 10;
            int b = 0;
            LOGGER.trace("a={}", a);
            LOGGER.trace("b={}", b);

            System.out.println(a / b);
        } catch (Exception e) {
            LOGGER.error("Error: {}", String.valueOf(e));
            LOGGER.error("{}", (Object) e.getStackTrace());  // use this method to track where the error is:

        }


    }
}
