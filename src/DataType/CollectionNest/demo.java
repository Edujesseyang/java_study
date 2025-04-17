package src.DataType.CollectionNest;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        // example 1:
        List<ArrayList<String>> studentWilling = new ArrayList<>();
        studentWilling.add(new ArrayList<>(Arrays.asList("SJSU", "UCB", "UCLA", "Stanford")));
        studentWilling.add(new ArrayList<>(Arrays.asList("MIT", "Hartford", "UCSB", "UCB")));
        studentWilling.add(new ArrayList<>(Arrays.asList("AMU", "UTD", "UCR", "UCI")));
        studentWilling.add(new ArrayList<>(Arrays.asList("Mission College", "De Anza College", "BCC", "PCC")));
        System.out.println(studentWilling);
        // iterating:
        for (ArrayList<String> arr : studentWilling) {
            for (String str : arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
        System.out.println("********************************************************");


        // example 2: mutability collection
        Map<String, List<String>> student_TargetSchools = new LinkedHashMap<>();
        student_TargetSchools.put("Jesse", new ArrayList<>(Arrays.asList("SJSU", "UCB", "UCLA", "Stanford")));
        student_TargetSchools.put("Lucky", new ArrayList<>(Arrays.asList("MIT", "Hartford", "UCSB", "UCB")));
        student_TargetSchools.put("Klee", new ArrayList<>(Arrays.asList("AMU", "UTD", "UCR", "UCI")));
        student_TargetSchools.put("Cookie", new ArrayList<>(Arrays.asList("35Th Middle School", "1st High School", "2rd Tech School", "CatFord Medical School")));
        student_TargetSchools.put("Sushi", new ArrayList<>(Arrays.asList("Mission College", "De Anza College", "BCC", "PCC")));
        System.out.println(student_TargetSchools);
        // iterating:
        student_TargetSchools.forEach((k, v) -> {
            System.out.print(k + ": ");
            for (String str : v) {
                System.out.print(str + ", ");
            }
            System.out.println();
        });
        System.out.println("********************************************************");


        // example 3: immutable collection
        Map<String, List<String>> student_TargetSchools2 = Map.ofEntries(
                Map.entry("Jesse", List.of("SJSU", "UCB", "UCLA", "Stanford")),
                Map.entry("Lucky", List.of("MIT", "Hartford", "UCSB", "UCB")),
                Map.entry("Klee", List.of("AMU", "UTD", "UCR", "UCI")),
                Map.entry("Cookie", List.of("35Th Middle School", "1st High School", "2rd Tech School", "CatFord Medical School")),
                Map.entry("Sushi", List.of("Mission College", "De Anza College", "BCC", "PCC"))
        );
        System.out.println(student_TargetSchools2);
        Set<Map.Entry<String, List<String>>> entryStudentTargetSchools = student_TargetSchools2.entrySet();
        for (Map.Entry<String, List<String>> p : entryStudentTargetSchools) {
            System.out.print(p.getKey() + " : ");
            for (String str : p.getValue()) {
                System.out.print(str + ", ");
            }
            System.out.println();
        }


    }
}
