package src.ATMproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userPool = new ArrayList<>();
        switch (login(sc)) {
            case "1" -> {
                // log in
            }
            case "2" -> userPool.add(signUp(userPool, sc));
            case "3" -> System.out.println("Thank your for using, Bye");
        }
    }

    public static String login(Scanner sc) {
        System.out.println("************************************");
        System.out.println("Welcome to ATM, Select the options:");
        System.out.println("1: Log In");
        System.out.println("2: Sign up");
        System.out.println("3: Exit");
        System.out.println("************************************");
        while (true) {
            String select = sc.nextLine();
            switch (select) {
                case "1" -> {
                    return "1";
                }
                case "2" -> {
                    return "2";
                }
                case "3" -> {
                    return "3";
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }

    public static User signUp(ArrayList<User> pool, Scanner sc) {
        User newUser = new User();
        boolean validUserName = false;
        boolean validUserPassword = false;
        String newUserName = "";
        String newUserPassword = "";
        while (!validUserName) {
            System.out.println("Enter your user name: ");
            newUserName = sc.nextLine();
            boolean isExsist = false;
            for (User user : pool) {
                if (newUserName.equals(user.getUserName())) {
                    System.out.println("User name existed, try another one");
                    isExsist = true;
                }
            }
            if (!isExsist) {
                validUserName = true;
            }
        }
        while (!validUserPassword) {
            System.out.println("Enter password: ");
            newUserPassword = sc.nextLine();
            if (newUserPassword.length() < 6) {
                System.out.println("password is has to be more than 6 digits");
                continue;
            }
            validUserPassword = true;
        }
        return new User(newUserName, 0, newUserPassword, 0.0);
    }
}

