package src.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class filter_demo {
    public static void main(String[] args) {
        // if we want to make a filter to get rid of some elements:
        // without using stream :
        List<String> testArr = new ArrayList<>();
        Collections.addAll(testArr, "ABC", "BBC", "CNN", "AKA", "AW");
        System.out.println(testArr);

        // get all has first letter A
        List<String> firstLetterAStrings = getStringsByFirstLetter(testArr, "A");
        System.out.println(firstLetterAStrings);

        // get all has length 3
        List<String> len3Strings = getStringsByLength(testArr, 3);
        System.out.println(len3Strings);

        // the first letter is A and length is 3
        List<String> len3FirstLetterA = getStringsByFirstLetter(getStringsByLength(testArr, 3), "A");
        System.out.println(len3FirstLetterA);

        // Using stream:
        testArr.stream().filter(e -> e.startsWith("A") && e.length() == 3).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // or
        testArr.stream().filter(e -> e.startsWith("A")).filter(e -> e.length() == 3).forEach(e -> System.out.print(e + " "));
        System.out.println();


        // steam.filter for an array:
        // use : Arrays.stream(array).filter( ... )
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(nums).filter(e -> e % 2 == 0 && e > 5).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // store the result into a new array.  (use .toArray() after filter)
        int[] nums2 = {26, 48, 26, 3, 69, 48, 15, 26, 59, 4, 77, 88};
        int[] numsAfterFilter = Arrays.stream(nums2).filter(e -> e % 2 != 0).toArray();
        System.out.println(Arrays.toString(numsAfterFilter));

        // get stream for an array:
        Stream<Integer> arrStream = Arrays.stream(nums);  // way 1
        Stream<Integer> arrStream2 = Stream.of(nums);  // way 2
        Stream<Integer> arrStream3 = IntStream.of(nums2).boxed();  // way 3 only for int[]
        // .anyMatch()...
        boolean isAny9 = arrStream.anyMatch(integer -> integer == 9);
        System.out.println("Is 9 in the number array? " + isAny9);
        // .max()   .min()
        Optional<Integer> max = arrStream2.max(Comparator.comparingInt(o -> o));
        System.out.println("The max is : " + (max.isPresent() ? max.get() : " null"));
        Optional<Integer> min = arrStream3.min(Comparator.comparingInt(o -> o));
        System.out.println("The min is : " + min.orElse(null));  // same as max.isPresent() ? max.get() : "null"


        // get the stream object from collections,
        Collection<String> test2 = new ArrayList<>(Arrays.asList("Jesse", "Cookie", "Sushi", "Jenny"));
        Stream<String> test2_stream = test2.stream();
        List<String> result2 = new ArrayList<>();
        test2_stream.filter(e -> e.charAt(0) == 'J').forEach(result2::add);
        System.out.println(result2);

        // get the stream object from maps:
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Coke", 2);
        m1.put("Pizza", 7);
        m1.put("Beer", 3);
        m1.put("Winne", 25);
        m1.put("Sake", 12);
        m1.put("Whiskey", 15);
        // get stream for keys:
        Stream<String> keyStream = m1.keySet().stream();
        keyStream.forEach(key -> System.out.print(key + " "));
        System.out.println();
        // get stream for values:
        Stream<Integer> valueStream = m1.values().stream();
        valueStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        // get stream for key-value pair(entries):
        Stream<Map.Entry<String, Integer>> pairStream = m1.entrySet().stream();
        pairStream.filter(p -> p.getValue() >= 10).forEach(p -> System.out.println(p.getKey() + " : " + p.getValue()));


        // override Predicate<>
        List<String> nameList = new ArrayList<>(Arrays.asList("Jesse", "Yang", "Amy", "May", "Chloe", "Cookie"));
        nameList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        return true;
                    }
                }
                return false;
            }
        }).forEach(e -> System.out.print(e + ", "));
        System.out.println();
        System.out.println("******************************************************************************");
        // use lambda :
        List<String> nameList2 = new ArrayList<>(Arrays.asList("Jesse", "Yang", "Amy", "May", "Chloe", "Cookie", "Banana"));
        nameList2.stream().filter(s -> {
            for (int i = 0; i < s.length() - 2; i++) {
                int charCount = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        charCount++;
                    }
                    if (charCount >= 3) {
                        return true;
                    }
                }
            }
            return false;
        }).forEach(e -> System.out.print(e + ", "));


        // .limit(int)   and    .skip(int)
        List<Integer> il1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.print("After skip 2 :");  // only show 3,4,5,6.   skip 1, 2
        il1.stream().filter(e -> e > 0).skip(2).forEach(e -> System.out.print(e + ", "));
        System.out.println();
        System.out.print("After limit 2 :");  // only show 1, 2.
        il1.stream().filter(e -> e > 0).limit(2).forEach(e -> System.out.print(e + ", "));
        System.out.println();


        // .map()
        List<String> sl1 = new ArrayList<>(Arrays.asList("Jesse", "Lucky", "Sushi"));
        sl1.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + " is happy! ";
            }
        }).forEach(System.out::println);
        // .map() with lambda:
        sl1.stream().map(s -> s + " is sad!! ").forEach(System.out::println);

        // use map() to convert all names to be student objects:
        // way 1, use toList() method.
        // *** .toList() return a immutable list, elements cannot be added, delete, or change ***
        List<Student> studentsList = sl1.stream().map(Student::new).toList();  // way 1 :(best,only for JAVA 16 and newer)
        System.out.println(studentsList);
        // For Java versions before 16, use .collect(Collectors.toList():
        // *** .Collector.toList() return a mutable list, elements can be added, delete, or change ***
        List<Student> studentsList1 = sl1.stream().map(Student::new).collect(Collectors.toList());  // For Java 8-15
        System.out.println(studentsList1);
        // way 2, use forEach method.
        List<Student> studentsList2 = new ArrayList<>();
        sl1.forEach(e -> studentsList2.add(new Student(e)));  // way 2 (w/o using stream and map):
        System.out.println(studentsList2);
        // way 3: build Student, then use them, then release, no storing them.
        sl1.stream().map(Student::new).forEach(System.out::println);  // way 3 ( w/o store objects)


        // concat streams:
        List<String> myList = new ArrayList<>(Arrays.asList("Jesse", "Sushi", "Lucky", "Noodle", "Klee", "Cookie"));
        Stream<String> s1 = myList.stream().filter(e -> e.startsWith("J") || e.startsWith("S"));
        Stream<String> s2 = myList.stream().filter(e -> e.startsWith("K"));
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(e -> System.out.print(e + ", "));
        System.out.println();
        // concat different types:
        List<Integer> myInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Stream<String> s6 = myList.stream().filter(e -> e.length() < 5);
        Stream<Integer> s4 = myInt.stream().filter(e -> e % 2 == 0 && e != 2);
        Stream<Object> s5 = Stream.concat(s6, s4);
        s5.forEach(e -> System.out.print(e + ", "));
        System.out.println();


        // collect and collector: toList()
        List<Integer> intList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        List<Integer> primeIn20 = intList1.stream().filter(e -> {
            if (e < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(e); i++) {
                if (e % i == 0) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toList());  // (mutable) JAVA 16 and below, (immutable) .toList() for JAVA 16 and above.
        System.out.println(primeIn20);
        // toArray()
        Object[] prime20 = intList1.stream().filter(e -> {  // it's an object array b/c <Integer> is not a strong restrict.
            if (e < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(e); i++) {
                if (e % i == 0) {
                    return false;
                }
            }
            return true;
        }).toArray();
        System.out.println(Arrays.toString(prime20));
        // if you want an Integer[]
        Integer[] intPrime20 = intList1.stream().filter(e -> {  // it's an object array b/c <Integer> is not a strong restrict.
            if (e < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(e); i++) {
                if (e % i == 0) {
                    return false;
                }
            }
            return true;
        }).toArray(Integer[]::new);  // lambda reference;
        System.out.println(Arrays.toString(intPrime20));


        // Extra: finding prime nums:
        List<Integer> primeIn40 = checkPrimes(40);
        System.out.println(primeIn40);

    }

    /**
     * input: a list string, and a string with a character.
     * output: a list of strings with all strings that lead to the input character.
     *
     * @param array       : List<String>
     * @param firstLetter : String (Single character)
     * @return List<String>
     */
    public static List<String> getStringsByFirstLetter(List<String> array, String firstLetter) {
        List<String> result = new ArrayList<>();
        for (String s : array) {
            if (s.startsWith(firstLetter)) {
                result.add(s);
            }
        }
        return result;
    }

    /**
     * input: a list string, length.
     * output: a list of strings with all strings that has input length.
     *
     * @param array  : List<String>
     * @param length : int
     * @return List<String>
     */
    public static List<String> getStringsByLength(List<String> array, int length) {
        List<String> result = new ArrayList<>();
        for (String s : array) {
            if (s.length() == length) {
                result.add(s);
            }
        }
        return result;
    }

    public static List<Integer> checkPrimes(int max) {
        boolean[] primeList = new boolean[max + 1];
        Arrays.fill(primeList, true);  // use Arrays.fill(target, value) to assign all elements are true;
        primeList[0] = false;
        primeList[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= max; j += i) {
                    primeList[j] = false;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < primeList.length; i++) {
            if (primeList[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
