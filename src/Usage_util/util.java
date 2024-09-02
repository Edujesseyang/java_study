package src.Usage_util;

import java.util.ArrayList;

public class util {
    private util() {
        // private the constructor to hide from public.
    }

    // Menu:
    //  String createCode(int max);
    //  Double getAvg(ArrayList<Double> numList)


    /**
     * Usage: create a random string to use it as verification code.
     *
     * @param max : The length of the verification code
     * @return string : verification code
     */
    public static String createCode(int max) {
        StringBuilder code = new StringBuilder();
        String codePool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKMLNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < max; i++) {
            int index = (int) (Math.random() * 62);
            code.append(codePool.charAt(index));
        }
        return code.toString();
    }

    public static Double getAvg(ArrayList<Double> numList) {
        if (numList != null) {
            Double sum = 0.0;
            for (Double num : numList) {
                sum += num;
            }
            return sum / numList.size();
        } else {
            return 0.0;
        }
    }

    /**
     * Usage: convert an int array to a string.
     *
     * @param array : int[]
     * @return String
     */
    public static String arrToString(int[] array) {
        if (array != null) {
            StringBuilder result = new StringBuilder();
            for (int i : array) {
                result.append(i);
            }
            return result.toString();
        } else {
            return "";
        }
    }
}
