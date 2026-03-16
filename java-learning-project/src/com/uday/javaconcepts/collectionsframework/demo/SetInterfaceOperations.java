package com.uday.javaconcepts.collectionsframework.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceOperations {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);

        System.out.println(set);

        Set<String> sets = new HashSet<>();
        sets.add("Uday");
        sets.add("uday");
        sets.add("uday");
        sets.add("kadam");
        sets.add("Kadam");

        System.out.println(sets);
        System.out.println(sets.size());
        System.out.println("Contains: Uday: " + sets.contains("Uday"));
        System.out.println("Contains: Uday, Kadam: " + sets.containsAll(Arrays.asList("Uday", "Kadam")));


        Set<Student> set1 = new HashSet<>();
        Student s1 = new Student(101,"Kadam");
        set1.add(s1);

        // This is the same object, so parent hashcode will be the same,
        // so no new data is added.
        set1.add(s1);

        // But here a new object is created with the same content
        // and add it into the set then it will be added,
        // why? because the hasCode of the object is different.
        // When content of 2 object is same then please make sure their hashcode reference also.
        // So in this case we need to override the equals() & hashCode() method.
        // we can create the hashCode using the class properties.
        set1.add(new Student(101,"Kadam"));
        set1.add(new Student(102,"Uday"));

        System.out.println(set1);

        System.out.println(set1.contains(s1));

        set1.clear();
    }
}
