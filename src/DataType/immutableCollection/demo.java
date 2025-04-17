package src.DataType.immutableCollection;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        // These collections are immutable, elements of these collections are not modifiable.

        // use Lost.of(...element...) to make an immutable collection.
        Collection<String> c1 = List.of("Jesse", "Sushi", "Klee");

        // or list
        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7);

        // use Set.of(...elements...) to make an immutable set.
        Set<Double> s1 = Set.of(1.2, 2.3, 3.4, 4.5, 5.6);  // can't have duplicate elements.

        // use Map.of(key1,value1,key2,value2 .....) to make an immutable map.
        Map<String, Double> m1 = Map.of("Coke", 1.99, "Orange Juice", 2.59, "Popeye chicken wings", 5.99);

        // use Map.Entries( ... Map.Entry(key, value)...) to make an immutable map;
        Map<String, List<String>> m2 = Map.ofEntries(
                Map.entry("Jesse", List.of("Cool", "Smart", "Handsome")),
                Map.entry("Lucky", List.of("Hairy", "Lazy", "Fat")),
                Map.entry("Klee", List.of("Weak", "Strange", "Sick"))
        );
    }
}
