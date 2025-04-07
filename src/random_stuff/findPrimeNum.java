
import java.util.ArrayList;

public class findPrimeNum {

    public static void main(String[] args) {
        int[] primeNum = findPrime(0, 100);
        printArr(primeNum);
        int[] randArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] primeNum2 = oneFuncToDone(randArr);
        printArr(primeNum2);

        int a = 10;
        int b = 5;
        System.out.println(isPrime(a));
        System.out.println(isPrime(b));

    }

    public static int[] findPrime(int min, int max) {
        ArrayList<Integer> primeNum = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primeNum.add(i);
            }
        }
        int[] primeNumArr = primeNum.stream().mapToInt(i -> i).toArray();
        return primeNumArr;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] oneFuncToDone(int[] array) {
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean isPrime;
        for (int element : array) {
            isPrime = true;
            if (element <= 1) {
                isPrime = false;
            }
            for (int i = 2; i <= Math.sqrt(element); i++) {
                if (element % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeList.add(element);
            }
        }
        int[] primeListArr = primeList.stream().mapToInt(i -> i).toArray();
        return primeListArr;
    }

    public static void printArr(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
