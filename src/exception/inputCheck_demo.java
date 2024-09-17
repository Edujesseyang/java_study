package src.exception;

import java.util.Scanner;

public class inputCheck_demo {
    public static void main(String[] args) throws InputAgeIllegelException {
        int age = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter you age: ");
                String age_input = sc.nextLine();
                try {
                    age = Integer.parseInt(age_input);
                    InputAgeIllegelException.checkAge(age);

                    if (age != 0) {
                        break;
                    }
                } catch (NumberFormatException | InputAgeIllegelException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Your age is : " + age);
    }
}
