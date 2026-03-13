package com.uday.javaconcepts.collectionsframework;

import java.util.HashSet;
import java.util.Set;

/*
=========================================================
SET INTERFACE
=========================================================

    Set represents a collection that does NOT allow duplicates.

Characteristics
---------------
    1 No duplicate elements
    2 No index
    3 Unordered (HashSet)

Implementations
---------------
    HashSet
    LinkedHashSet
    TreeSet
*/

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Python");
        set.add("Python");
        set.add("Java");

        System.out.println(set);
        System.out.println("Size: " + set.size());
        // System.out.println(set.get(0)); // java: cannot find symbol
    }
}

/*
OUTPUT (duplicates removed)
--------------------------------
[Java, Python]
Size: 2
*/