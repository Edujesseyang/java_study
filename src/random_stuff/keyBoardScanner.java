
import java.util.Scanner;

public class keyBoardScanner {

    private String name;
    private int age;

    public static void main(String[] args) {
        keyBoardScanner personalInfo = new keyBoardScanner();
        personalInfo.name = "";
        personalInfo.age = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            personalInfo.name = sc.nextLine();
            while (personalInfo.name.equals("")) {
                System.out.print("Invalid input, try again : ");
                personalInfo.name = sc.nextLine();
            }

            System.out.print("Enter your age: ");
            personalInfo.age = sc.nextInt();
            while (personalInfo.age < 0) {
                System.out.print("Invalid input, try again : ");
                personalInfo.age = sc.nextInt();
            }
        }

        printInfo(personalInfo.name, personalInfo.age);
    }

    public static void printInfo(String name, int age){
        String info = "Your name is " + name + " and your age is " + age;
        System.err.println("Your info:\n" + info);       
    }

}
