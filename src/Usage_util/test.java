package src.Usage_util;

public class test {
    public static void main(String[] args) {
        System.out.println(util.createCode(6));
        System.out.println(util.createCode(7));
        System.out.println(util.createCode(8));

        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String num = util.arrToString(numList);
        System.out.println(num);
    }
}
