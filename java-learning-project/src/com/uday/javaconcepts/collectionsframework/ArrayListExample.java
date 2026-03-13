package com.uday.javaconcepts.collectionsframework;

import java.util.ArrayList;

/*
=========================================================
ARRAYLIST CLASS
=========================================================

    ArrayList uses dynamic array internally.

Features
--------
    1 Resizable array
    2 Fast random access
    3 Allows duplicates
    4 Not synchronized

Common Methods
--------------
    add()
    remove()
    get()
    size()
*/

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("First Element: " + numbers.get(0));
        System.out.println("Last Element: " + numbers.getLast());
        System.out.println("Size: " + numbers.size());
        System.out.println("Numbers: " + numbers);
        System.out.println(numbers.get(30)); // RuntimeException
    }
}

/*
OUTPUT
--------------------------------
First Element: 10
Last Element: 30
Size: 3
Numbers: [10, 20, 30]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 30 out of bounds for length 3
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.util.Objects.checkIndex(Objects.java:385)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at com.uday.javaconcepts.collectionsframework.ArrayListExample.main(ArrayListExample.java:41)
*/