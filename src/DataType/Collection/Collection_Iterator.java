package src.DataType.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Collection_Iterator {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("I");
        c1.add("have");
        c1.add("a");
        c1.add("cat");
        c1.add("his");
        c1.add("name");
        c1.add("is");
        c1.add("Lucky");

        // get new iterator:
        Iterator<String> i = c1.iterator();
        String s1 = i.next();
        System.out.println(s1);
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next()); // STOP, Don't cross over bond.

        // reset the iterator:
        i = c1.iterator();

        // use while loop and .hasNext() to iterate:  (cannot use on Array)
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        // for each loop:     (can use on Array)
        for (String s : c1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // for each for an array
        Double[] myDb = {100.0, 25.3, 26.3, 23.1, 5.9};
        double sum = 0.0;
        for (Double aDouble : myDb) {
            sum += aDouble;
        }
        System.out.println("Total: " + sum);
        System.out.println("Avg: " + sum / myDb.length);

        // for each loop will copy every element before the loop body, if the user changes the element's value,
        // the origin list won't be changed.
        for (Double v : myDb) {
            v = 0.0;
        }
        System.out.println(Arrays.toString(myDb));  // not changed.

        // what we can do, we can create a new list, add each element to the new list. (not efficiency)
        int size = 0;
        double[] newDd = new double[size];
        for (Double v : myDb) {
            size++;
            newDd = new double[size];
            newDd[size - 1] = v;
        }
        System.out.println(Arrays.toString(newDd));

        // use my arrayCopy method:
        String[] myStr = {"1", "2", "3", "4"};
        String[] copyStr = arrayCopy(myStr);
        System.out.println(Arrays.toString(copyStr));

        Double[] myDb2 = {2.3, 2.5, 5.6, 2.1, 9.6};
        Double[] copyDb2 = arrayCopy(myDb2);
        System.out.println(Arrays.toString(copyDb2));

        // lambda iterate, use forEach method:
        Collection<String> c3 = new ArrayList<>(Arrays.asList("str1", "str2", "str3"));
        c3.forEach(s -> System.out.print(s + " "));
        System.out.println();// lambda
        // it same as:
        c3.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });  // above is the old style.
        System.out.println();

        // use Arrays.asList(elements):
        ArrayList<Integer> myIntegers = new ArrayList<>(Arrays.asList(1, 2, 3));
        myIntegers.forEach(System.out::println);  // a way to print each a line

        // forEach to append:
        Collection<Double> myDoubles = new ArrayList<>(Arrays.asList(2.3, 3.6, 2.3, 2.1));
        Collection<Double> newDoubles = new ArrayList<>();
        myDoubles.forEach(newDoubles::add);
        newDoubles.forEach(System.out::print);
        // use addAll for the same result:
        Collection<Double> newNewDouble = new ArrayList<>();
        newNewDouble.addAll(newDoubles);
        newNewDouble.forEach(System.out::println);
        // better way:
        Collection newNewNewDouble = new ArrayList(newNewDouble);
        newNewNewDouble.forEach(System.out::println);


    }

    public static <T> T[] arrayCopy(T[] array) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        int i = 0;
        for (T e : array) {
            newArray[i] = e;
            i++;
        }
        return newArray;
    }
}
