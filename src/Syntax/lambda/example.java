package src.Syntax.lambda;

import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        // use lambda to shorting comparator
        Integer[] arr = {5, 4, 8, 7, 9, 6, 3, 2, 1};

        // this can be replaced with lambda
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        // simplified:
//        Arrays.sort(arr, (Integer o1, Integer o2) -> {
//            return o2 - o1;
//        });

        // simplified more:
//        Arrays.sort(arr, (o1, o2) -> {
//            return o2 - o1;
//        });  

        // simplified even more:
        Arrays.sort(arr, (o1, o2) -> o2 - o1);  // Final version. This call lambda expression
        System.out.println(Arrays.toString(arr));


        Double[] doubleArr = {1.1, 2.3, 3.6, 6.5, 9.6, 8.0};
        Arrays.sort(doubleArr, (o1, o2) -> Double.compare(o2, o1));  // lambda
        System.out.println(Arrays.toString(doubleArr));
    }

}


