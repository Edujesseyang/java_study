package src.Syntax.variadicMethod;

public class demo {
    public static void main(String[] args) {

        System.out.println(sumOf(1));
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(1, 2, 3));
        System.out.println(sumOf(1, 4, 5, 6));
        System.out.println(sumOf(1, 6, 7, 8, 5));
        System.out.println(sumOf(1, 5, 6, 7, 8, 4));
        int[] numArr = {1, 2, 3, 4, 5};
        System.out.println(sumOf(numArr));
        // try out the overridden method for double
        System.out.println(sumOf(3.4, 5.4, 3.4, 4.03024));

        // try out multi-param method:
        System.out.println(doMath('+', 1.0, 2.0, 3.0, 4.0));
        System.out.println(doMath('-', 1.0, 2.0, 3.0, 4.0));
        System.out.println(doMath('*', 1.0, 2.0, 3.0, 4.0));
        System.out.println(doMath('/', 1.0, 2.0, 3.0, 4.0));

    }

    // Method can only have one variadic parameter
    public static int sumOf(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double sumOf(double... nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return Math.round(sum * 100) / 100.0;
    }

    // variadic parameter has to be the last param:
    public static double doMath(char operation, double... nums) {
        if (operation == '+') {
            double sum = 0;
            for (double n : nums) {
                sum += n;
            }
            return sum;
        } else if (operation == '-') {
            double differemce = nums[0];
            for (int i = 1; i < nums.length; i++) {
                differemce -= nums[i];
            }
            return differemce;
        } else if (operation == '*') {
            double product = 1;
            for (double n : nums) {
                product *= n;
            }
            return product;
        } else if (operation == '/') {
            double quotient = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                quotient /= nums[i];
            }
            return quotient;
        }
        throw new IllegalArgumentException("Invalid operation: " + operation);
    }
}