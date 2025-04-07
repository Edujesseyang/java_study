
import java.util.Scanner;

public class scoring {

    public static void main(String[] args) {
        System.out.println("Enter how many scores do you have: ");
        try (Scanner sc = new Scanner(System.in)) {
            int numOfScores = sc.nextInt();
            System.out.println("Enter scores:");
            double[] scores = getScores(numOfScores);
            printArr(scores);
            System.out.println("Final score: " + finalScore(scores));
        }

    }

    public static double[] getScores(int numOfScores) {
        double[] scores;
        try (Scanner sc = new Scanner(System.in)) {
            scores = new double[numOfScores];
            for (int i = 0; i < numOfScores; i++) {
                scores[i] = sc.nextDouble();
            }
        }
        return scores;
    }

    public static double finalScore(double[] numOfScores) {
        double sum = 0;
        double max = numOfScores[0];
        double min = numOfScores[0];
        for (int i = 0; i < numOfScores.length; i++) {
            if (numOfScores[i] > max) {
                max = numOfScores[i];
            }
            if (numOfScores[i] < min) {
                min = numOfScores[i];
            }
            sum += numOfScores[i];
        }

        sum = sum - max - min;
        sum = sum / (numOfScores.length - 2);

        return ((int) (sum * 100)) / 100.0;
    }

    public static void printArr(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
