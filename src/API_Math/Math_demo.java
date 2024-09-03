package src.API_Math;

public class Math_demo {
    public static void main(String[] args) {
        // absolute value:
        int abs1 = Math.abs(-10);
        System.out.println(abs1);

        // ceiling a double:
        double ceil = Math.ceil(1.000001); // return type: double
        System.out.println(ceil);

        // floor a double:
        double floor = Math.floor(10.999999); // return type: double
        System.out.println(floor);

        // power of:
        double pow = Math.pow(2, 3);  // return type: double
        System.out.println(pow);

        // round of and PI:
        long roundNum = Math.round(Math.PI); // return type: long.  PI is double.
        System.out.println(roundNum);

        // random: (get a random double between 0(include) and 1(exclude):
        // if we want to get a number between min and max:
        int max = 10;
        int min = 5;
        int rand = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(rand);

    }
}
