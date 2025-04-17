
public class ifElse {

    public static void main(String[] args) {
        // 1. if else example:
        int a = 12;
        int b = 10;
        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is greater than " + b);
        }

        // 2. if else-if example:
        int c = 15;
        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else if (a < c) {
            System.out.println(a + " is also less than " + c);
        } else {
            System.out.println(a + " is not less than " + b + " or " + c);
        }

        // 3. switch case (old way) **Not Recommend in java**
        // switch (a) {
        //     case 10:
        //         System.out.println("a is 10");
        //         break;
        //     case 9:
        //         System.out.println("a is 9");
        //         break;
        //     default:
        //         System.out.println("a is not 10 or 9");
        //         break;
        // }

        // 4. rule-switch: (better practice)
        String text = switch (a) {
            case 10 ->
                "a is 10";
            case 9 ->
                "a is 9";
            default ->
                "a is not 10 or 9";
        };
        System.out.println(text);


        printAllPrimeNumber(100);
        paperFoldReachMountainTop(8848, 0.01);
    }

    public static int findMonthDay(int month) {
        int monthDay = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 4, 6, 9, 11 ->
                30;
            case 2 ->
                28;
            default ->
                -1;
        };
        return monthDay;
    }

    public static void printAllPrimeNumber(int max) {
        for (int i = 2; i <= max; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }

    public static int paperFoldReachMountainTop(double MountainHeight_m, double paperThickness_mm) {
        System.out.println("For a big enough paper with thickness " + paperThickness_mm + "mm, ");
        System.out.println("We need to fold how many time to reach the mountain top with the height is " + MountainHeight_m + "m?");
        double MountainHeight_mm = MountainHeight_m * 1000;
        int time = 0;
        while(paperThickness_mm < MountainHeight_mm){
            paperThickness_mm *= 2;
            time++;
        }
        System.err.println("Answer is " + time + " times.");
        return time;
        }
}
