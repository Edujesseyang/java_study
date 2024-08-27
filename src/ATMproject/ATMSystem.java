package src.ATMproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    static ArrayList<User> userPool = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stillUsing = true;
        while (stillUsing) {
            switch (mainMenu(sc)) {
                case "1" -> loginMenu(login(userPool, sc), sc);
                case "2" -> signUp(userPool, sc);
                case "3" -> {
                    System.out.println("Thank your for using ATM system, Bye");
                    stillUsing = false;
                }
            }
        }
    }

    public static String mainMenu(Scanner sc) {
        System.out.println("************************************");
        System.out.println("Welcome to ATM, Select the options:");
        System.out.println("1: Log In");
        System.out.println("2: Sign up");
        System.out.println("3: Exit");
        System.out.println("************************************");
        System.out.print("Enter your choice: ");
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

    public static User login(ArrayList<User> pool, Scanner sc) {
        while (true) {
            System.out.println("Enter your username: ");
            String userName = sc.nextLine();
            for (User u : pool) {
                if (u.getUserName().equals(userName)) {
                    System.out.println("Enter password:");
                    String passWord = sc.nextLine();
                    if (u.getPassWord().equals(passWord)) {
                        return u;
                    } else {
                        System.out.println("Wrong password");
                        break;
                    }
                }
            }
            System.out.println("User not found! ");
        }
    }

    public static void signUp(ArrayList<User> pool, Scanner sc) {
        boolean validUserName = false;
        boolean validUserPassword = false;
        String newUserName = "";
        String newUserPassword = "";
        while (!validUserName) {
            System.out.println("Enter your user name: ");
            newUserName = sc.nextLine();
            boolean isExist = false;
            for (User user : pool) {
                if (newUserName.equals(user.getUserName())) {
                    System.out.println("User name existed, try another one");
                    isExist = true;
                }
            }
            if (!isExist) {
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
        Integer userId = (int) (Math.random() * (999999 - 100000 + 1)) + 100000;
        for (User user : pool) {
            if (userId.equals(user.getUserID())) {
                userId = (int) (Math.random() * (999999 - 100000 + 1)) + 100000;
            }
        }

        System.out.println("Account created successfully!");
        pool.add(new User(newUserName, userId, newUserPassword, 0.0));
    }

    public static void loginMenu(User user, Scanner sc) {
        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        boolean isUsing = true;
        while (isUsing) {
            System.out.println("*****************User Menu*****************");
            System.out.println("1. Print User Information");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer to other user");
            System.out.println("6. Change password");
            System.out.println("7. Log out ");
            System.out.println("8. Help");
            System.out.println("********************************************");
            System.out.println("Enter option:");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> user.printInfo();
                case 2 -> System.out.println("Balance: " + user.getBalance());
                case 3 -> {
                    System.out.println("Enter how much do you want to deposit: ");
                    user.deposit(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Balance: " + user.getBalance());
                }
                case 4 -> {
                    System.out.println("Enter how much do you want to withdraw: ");
                    user.withdraw(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Balance: " + user.getBalance());
                }
                case 5 -> {
                    boolean stillWorking = true;
                    do {
                        System.out.println("Enter how much do you want to transfer: ");
                        double transAmount = sc.nextDouble();
                        sc.nextLine();
                        if (transAmount == -1) {
                            stillWorking = false;
                        }
                        if (transAmount > user.getBalance()) {
                            System.out.println("Not enough money in your account! (enter -1 to cancel)");
                        } else {
                            System.out.println("Enter the receiver's account number: ");
                            Integer carNumber = sc.nextInt();
                            sc.nextLine();
                            for (User u : userPool) {
                                if (carNumber.equals(u.getUserID())) {
                                    u.deposit(transAmount);
                                    user.withdraw(transAmount);
                                    System.out.println("Transition Successfully!");
                                    stillWorking = false;
                                    break;
                                }
                            }
                            if (!stillWorking) {
                                break;
                            }
                        }
                    } while (stillWorking);
                }
                case 6 -> {
                    boolean done = false;
                    while (!done) {
                        String passwordConfirm;
                        String newPassword;
                        System.out.println("Enter password:");
                        passwordConfirm = sc.nextLine();
                        if (passwordConfirm.equals(user.getPassWord())) {
                            System.out.println("Enter new password");
                            newPassword = sc.nextLine();
                            System.out.println("Confirm password: ");
                            passwordConfirm = sc.nextLine();
                            if (newPassword.equals(passwordConfirm)) {
                                user.setPassWord(newPassword);
                                done = true;
                                System.out.println("Password changed successfully!");
                            }
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Return to main menu, Thanks for using.");
                    isUsing = false;
                }
                case 8 -> System.out.println("Call: (800)5326-8588 to get help");
            }
        }
    }
}
