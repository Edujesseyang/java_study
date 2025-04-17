
public class loop {

    public static void main(String[] args) {
        // 1. for loop:
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // 2. while loop
        int d = 0;
        while (d < 10) {
            System.out.println(d);
            d++;
        }

        // 3. do-while loop
        int e = 10;
        do {
            System.out.println(e);
            e++;
        } while (e < 10);

        // 4. nested for loop
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. iterating array
        int[] array = {1, 2, 3, 4, 5};
        for (int number : array) {
            System.out.println(number);
        }
    }
}
