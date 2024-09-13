package src.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class filter_demo {
    public static void main(String[] args) {

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
}
