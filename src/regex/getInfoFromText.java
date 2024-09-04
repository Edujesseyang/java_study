package src.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getInfoFromText {
    public static void main(String[] args) {


        // target text:
        String text = "My name is Jesse Yang, my phone # is 696-695-6533; Email is geddjcer@gmail.com;"
                + "Lucky has number (343)545-5366, email is hre33a_eg5@ggfms.org"
                + "And there is a cat call cookie, number is 525-525-6969, email is jcjcjrunss@fgjgam.com";

        // make our pattern:
        String regex = "(\\d{3}-\\d{3}-\\d{4})|" + "(\\(\\d{3}\\)\\d{3}-\\d{4})|" + "(\\w{2,20}@\\w{2,10}\\.(com|net|org|mil))";

        // make a Pattern object:
        Pattern pat = Pattern.compile(regex);
        // make a Matcher:
        Matcher mat = pat.matcher(text);

        // email list:
        ArrayList<String> emails = new ArrayList<>();

        // phone list:
        ArrayList<String> phones = new ArrayList<>();

        // loop the print-out info
        while (mat.find()) {
            String finds = mat.group();
            if (finds.matches("(\\d{3}-\\d{3}-\\d{4})|(\\(\\d{3}\\)\\d{3}-\\d{4})")) {
                phones.add(finds);
            } else {
                emails.add(finds);
            }
        }

        // print out the result:
        System.out.println("Phone number list:");
        for (String s : phones) {
            System.out.println(s);
        }
        System.out.println("Email list:");
        for (String s : emails) {
            System.out.println(s);
        }
    }
}
