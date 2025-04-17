package src.DataType.map;

import java.util.*;
import java.util.function.BiConsumer;

public class demo {
    public static void main(String[] args) {

        // map is key=value type of set:
        Map<String, String> m1 = new HashMap<>();  // Map is an interface;
        m1.put("key1", "value1");
        m1.put("key2", "value2");
        m1.put("key3", "value3");
        m1.put("key4", "value4");
        m1.put("key5", "value5");
        m1.put("key6", "value6");
        System.out.println("m1 : " + m1);


        // The Map includes HashMap, HashTable, TreeMap.
        // HashMap includes LinkedHashMap.
        // HashTable includes Properties.
        // The keys of the Map are ordered, non-duplicated.
        // Key and value both can be null.
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("Mike", 23);
        m2.put("Cookie", 35);
        m2.put("Chloe", 15);
        m2.put("David", 54);
        m2.put(null, null);
        System.out.println("m2 : " + m2);

        // linked hashmap
        Map<String, Integer> m3 = new LinkedHashMap<>();
        m3.put("Jesse", 23);
        m3.put("Lucky", 35);
        m3.put("Klee", 15);
        m3.put("Sushi", 54);
        m3.put(null, null);
        System.out.println("m3 : " + m3);  // keys are in alphabetical order.

        // methods:
        // .put(key, value);

        // .remove(key);
        m3.remove(null);
        System.out.println("m3 : " + m3);

        // .clear()  -- delete all elements.
        m1.clear();
        System.out.println("m1 : " + m1);

        // .isEmpty()
        System.out.println("Is m1 empty now? \n" + m1.isEmpty());

        // boolean containKey(key)  -- check if contain a key
        String key = "Jesse";
        System.out.println("Is the key(" + key + ") in the m3 ?\n" + m3.containsKey(key));

        // boolean containValue(value)  -- check if contain a value
        Integer value = 100;
        System.out.println("Is the value(" + value + ") in the m3 ?\n" + m3.containsValue(value));

        // int size()  -- return the size of the map;
        System.out.println("The size of m3 is : " + m3.size());

        // .get(key)
        String myKey = "Jesse";
        int score = m3.get(myKey);
        System.out.println(myKey + " is " + score);

        // .keySet()  -- return a set of all keys.
        Set<String> keySet = m3.keySet();
        System.out.println(keySet);

        // .values()  -- return a collection of all values.
        Collection<Integer> values = m3.values();
        System.out.println(values);

        // .putAll(map)
        m3.putAll(m2);
        System.out.println(m3);

        // iteration of maps.
        for (Integer v : m3.values()) {
            if (v != null) {
                System.out.println(v);
            } else {
                System.out.println("null");
            }
        }

        // iteration by keys
        for (String k : m3.keySet()) {
            if (m3.get(k) != null) {
                System.out.println(k + " : " + m3.get(k));
            } else {
                System.out.println("null" + " : " + m3.get(k));
            }
        }

        // use a class to convert the map to a set
        Set<Student> sSet = new HashSet<>();
        for (String k : m3.keySet()) {
            Student s = new Student(k, m3.get(k));
            sSet.add(s);
        }
        System.out.println(sSet);


        // Set<Map.Entry<K, V>>
        // use entrySet convert Map to Set

        Set<Map.Entry<String, Integer>> entrySet = m3.entrySet();
        System.out.println(entrySet);
        entrySet.forEach(e -> System.out.print(e + " "));
        System.out.println();
        // or
        entrySet.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        // or
        m3.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.print(s + i);
            }
        });
        // or
        m3.forEach((k, v) -> System.out.println(k + " : " + v));
        // or
        for (Map.Entry<String, Integer> entry : entrySet) {
            // use .getKey() or .getValue() to get the key or value.
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // get avg score:
        int sum = 0;
        for (
                Map.Entry<String, Integer> e : entrySet) {
            if (e.getValue() != null) {
                sum += e.getValue();
            }
        }

        double avg = Math.round((double) (sum) / entrySet.size() * 100) / 100.0;
        System.out.println("The avg score is : " + avg);

    }
}

class Student {
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() == o.getClass()) {
            return this.name.equals(((Student) o).getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.score;
    }
}
