
import java.util.Random;
import java.util.Scanner;

public class numGuess {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Guess the number in pool, there are 5 numbers(1-20), You have 5 chance to guess at least one of them:");
            int[] pool = poolGenerator();
            int guessNum = sc.nextInt();
            boolean isWin = false;
            int chance = 5;
            while (!isWin && chance > 1) {
                for (int element : pool) {
                    if (guessNum == element) {
                        System.err.println("Bingo! You win, the number is " + guessNum + ".");
                        isWin = true;
                        break;
                    } else {
                        System.out.println("Wrong! Try again:");
                        chance--;
                        System.out.println("You have " + chance + " chance to guess.");
                        guessNum = sc.nextInt();
                        break;
                    }
                }
                if (chance == 0) {
                    System.out.println("You lose, the numbers are: ");
                    for (int element : pool) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                }
            }
            if (chance == 1) {
                System.out.println("You lose, the numbers are: ");
                for (int element : pool) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }

        }

    }

    public static int[] poolGenerator() {
        int num1 = new Random().nextInt(20);
        int num2 = new Random().nextInt(20);
        int num3 = new Random().nextInt(20);
        int num4 = new Random().nextInt(20);
        int num5 = new Random().nextInt(20);
        int[] pool = {num1, num2, num3, num4, num5};
        return pool;
    }

}
