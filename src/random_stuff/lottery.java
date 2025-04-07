
import java.util.InputMismatchException;
import java.util.Scanner;

public class lottery {

    public static void main(String[] args) {
        int[] myLottery = buySelect();
        int[] winning = getNumArray();
        System.out.println("My lottery: ");
        printArr(myLottery);
        System.out.println("Winning lottery: ");
        printArr(winning);
        int prize = checkWin(winning, myLottery);
        System.out.print("You win " + prize + " dollars!");
    }

    public static int[] getNumArray() {
        int[] winning = new int[7];
        for (int i = 0; i < 6; i++) {
            winning[i] = ((int) (Math.random() * 33)) + 1;
            for (int j = 0; j < i; j++) {
                if (winning[i] == winning[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            winning[6] = ((int) (Math.random() * 16)) + 1;
            if (winning[6] == winning[i]) {
                i--;
            }
        }
        return winning;
    }

    public static int[] buySelect() {
        System.out.println("Welcome to buy select lottery! Enter 6 numbers from 1-33 + 1 number from 1-16: ");
        int[] select = new int[7];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                try {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    select[i] = sc.nextInt();
                    if (select[i] < 1 || select[i] > 33) {
                        System.err.println("Out of range!");
                        i--;
                    }
                    for (int j = 0; j < i; j++) {
                        if (select[i] == select[j]) {
                            System.err.println("No Duplicate Number!");
                            i--;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Invalid input!");
                    sc.next();
                    i--;
                }
            }

            try {
                System.out.print("Enter Special Number: ");
                select[6] = sc.nextInt();
                if (select[6] < 1 || select[6] > 16) {
                    System.err.println("Out of range!");
                    select[6] = 0;
                }
                for (int i = 0; i < 6; i++) {
                    if (select[6] == select[i]) {
                        System.err.println("No Duplicate Number!");
                        select[6] = 0;
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input!");
                sc.next();
            }
        }
        System.out.println("Thank you for buying!");
        return select;
    }

    public static void printArr(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("| " + array[array.length - 1]);
        System.out.println("]");
    }

    public static int checkWin(int[] select, int[] winning) {
        int match = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (select[i] == winning[j]) {
                    match++;
                }
            }
        }
        boolean lastMatch = false;
        if (select[6] == winning[6]) {
            lastMatch = true;
        }
        if (lastMatch) {
            if (match <= 2) {
                return 5;
            } else if (match == 3) {
                return 10;
            } else if (match == 4) {
                return 200;
            } else if (match == 5) {
                return 3000;
            } else if (match == 6) {
                return 10000000;
            } else {
                return 0;
            }
        } else {
            return switch (match) {
                case 4 ->
                    10;
                case 5 ->
                    200;
                case 6 ->
                    5000000;
                default ->
                    0;
            };
        }
    }
}
