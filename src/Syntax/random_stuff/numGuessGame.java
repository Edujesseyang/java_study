
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class numGuessGame {

    public static void main(String[] args) {

        int max = getDifficulty();

        int targetNum = getRandomNum(max);
        guessNum(targetNum);

    }

    public static int getRandomNum(int max) {
        return new Random().nextInt(max) + 1;
    }

    public static int getDifficulty() {
        System.out.println("What is the difficult level do you want to play? (1: Easy(0-100), 2: Medium(0-500), 3: Hard(0-1000))");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    int choice = sc.nextInt();
                    if (choice == 1 || choice == 2 || choice == 3) {
                        switch (choice) {
                            case 1 -> {
                                return 100;
                            }
                            case 2 -> {
                                return 500;
                            }
                            case 3 -> {
                                return 1000;
                            }
                        }
                    } else {
                        System.err.println("Enter 1, 2 or 3 only: ");
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Invalid input: " + e.getMessage());
                    sc.next();
                }
            }
        }
    }

    /**
     * @param target int: the number need to guess
     * @return none
     * @FIXME scanner issue, need to be fixed
     */
    public static void guessNum(int target) {
        int chance = 7;
        try (Scanner sc = new Scanner(System.in)) {
            while (chance > 0) {
                System.out.println("Guess the number: ");
                System.out.println("You have " + chance + " chance to guess");
                try {
                    int inputNum = sc.nextInt();  // FIXME
                    if (inputNum == target) {
                        System.out.println("Bingo! You win, the number is " + target + ". You used " + (7 - chance) + " times to win! ");
                        break;
                    } else if (inputNum > target) {
                        System.out.println("It is too big.");
                    } else {
                        System.out.println("It is too small.");
                    }
                    chance--;
                } catch (InputMismatchException e) {
                    System.err.println("Invalid input: " + e.getMessage());
                    sc.next();
                }
            }
            if (chance == 0) {
                System.out.println("You lose, the number is " + target + ".");
            }
        }
    }

}
