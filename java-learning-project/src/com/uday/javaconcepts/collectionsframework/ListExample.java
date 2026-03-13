package com.uday.javaconcepts.collectionsframework;

import java.util.ArrayList;
import java.util.List;

/*
=========================================================
LIST INTERFACE
=========================================================

    List represents an ordered collection.

Characteristics
---------------
    1 Allows duplicates
    2 Maintains insertion order
    3 Allows index access

Common Implementations

    ArrayList
    LinkedList
    Vector
    Stack
*/

public class ListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");

        System.out.println(list);

        list.addAll(List.of(new String[]{"PHP", "Node"}));
        System.out.println(list);

        // ArrayList<int> listInt = new ArrayList<>(); // Type argument cannot be of a primitive type
        ArrayList<String> listInt = new ArrayList<>();
        listInt.add("11");
        listInt.add("12");

        System.out.println(listInt);
        list.addAll(listInt);
        System.out.println(list);
        System.out.println(list.get(20)); // RuntimeException

    }
}

/*
OUTPUT
--------------------------------
[Java, Python, Java]
[Java, Python, Java, PHP, Node]
[11, 12]
[Java, Python, Java, PHP, Node, 11, 12]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 7
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.util.Objects.checkIndex(Objects.java:385)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at com.uday.javaconcepts.collectionsframework.ListExample.main(ListExample.java:50)
*/