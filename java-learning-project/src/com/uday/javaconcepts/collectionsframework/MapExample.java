package com.uday.javaconcepts.collectionsframework;

import java.util.HashMap;
import java.util.Map;

/*
=========================================================
MAP INTERFACE
=========================================================

    Map stores data in key-value pairs.

Characteristics
---------------
    1 Key must be unique
    2 Value can duplicate
    3 Not part of Collection interface

Implementations

    HashMap
    TreeMap
    LinkedHashMap
    Hashtable
*/

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Go");

        System.out.println(map);

        map.put(2, "PHP");
        System.out.println(map);

        // If key does not exist then returns the `null`.
        System.out.println(map.get(20));
    }
}

/*
OUTPUT
--------------------------------
{1=Java, 2=Python, 3=Go}
{1=Java, 2=PHP, 3=Go}
null
*/