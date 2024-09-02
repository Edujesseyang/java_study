package src.string;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // Note: arrayList only work with reference data type. Not primitive int, double, boolean
        // define arrayList with fixed data type (recommend)
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(3);
        al1.add(0, 1);
        printArrLst(al1);

        // arrayList with dynamic data type (Not recommend)
        ArrayList alt2 = new ArrayList();
        alt2.add("Hello");
        alt2.add("World");
        alt2.add('!');
        alt2.add(1);
        alt2.add(1.33);
        alt2.add(true);

        // just in case if we need to know if add successfully. it will return boolean.
        System.out.println("Added ? " + alt2.add(14));
        printArrLst(alt2);

        // ArrayList[] in two dimension
        ArrayList<Integer[]> twoDimension = new ArrayList<>();
        Integer[] int1 = {1, 2, 3};
        Integer[] int2 = {4, 5, 6};
        twoDimension.add(int1);
        twoDimension.add(int2);
        System.out.println(twoDimension.get(0)[0]);
        printArr(twoDimension.get(0));
        printArr(twoDimension.get(1));

        ArrayList<ArrayList<Integer>> twoDArrLst = new ArrayList<>();
        ArrayList<Integer> spot1 = new ArrayList<>();
        ArrayList<Integer> spot2 = new ArrayList<>();
        ArrayList<Integer> spot3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            spot1.add(i);
            spot2.add(i + 3);
            spot3.add(i + 6);
        }
        twoDArrLst.add(spot1);
        twoDArrLst.add(spot2);
        twoDArrLst.add(spot3);

        for (ArrayList<Integer> integers : twoDArrLst) {
            printArrLst(integers);
        }

        // universe type : object
        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add(1);
        objectArrayList.add(2.2);
        objectArrayList.add(false);
        objectArrayList.add("Ok");
        objectArrayList.add('A');
        printArrLst(objectArrayList);

        // .remove(index) and .remove(object)
        boolean deleteStatus = objectArrayList.remove("1"); // remove with value, return boolean
        System.out.println("Is delete? " + deleteStatus);
        Object deleteInt = objectArrayList.remove(1); // remove with index, return deleting element
        System.out.println(deleteInt);

        // .size()
        System.out.println(objectArrayList.size());

        // .get(index)
        System.out.println(twoDArrLst.get(0).get(0));

        // System.out.println(ArrayList): arrayList can print out directly.
        System.out.println(objectArrayList);
        System.out.println(twoDArrLst);

        /* delete element by condition */
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(96);
        scores.add(46);
        scores.add(87);
        scores.add(67);
        scores.add(35);
        scores.add(59);
        scores.add(36);
        scores.add(76);
        scores.add(73);
        scores.add(98);
        ArrayList<Integer> evenScores = new ArrayList<>();
        // way 1: (one step back every time delete any element)
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) % 2 == 0) {
                evenScores.add(scores.remove(i));
                i--;
            }
        }
        System.out.println(scores);
        System.out.println(evenScores);

        // way 2: (check from last to first)
        for (int i = (scores.size() - 1); i >= 0; i--) {
            if (scores.get(i) < 50) {
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }

    public static <T> void printArrLst(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static <T> void printArr(T[] array) {
        System.out.print("{");
        for (T element : array) {
            System.out.print(element + ", ");
        }
        System.out.print("}");
        System.out.println();
    }
}
