package com.uday.javaconcepts.collectionsframework;

import com.uday.javaconcepts.collectionsframework.demo.Student;

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

        //Map<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Go");
        map.put(5, "Go");

        System.out.println(map); // {1=Java, 2=Python, 3=Go}

        map.put(2, "PHP");
        System.out.println(map); // {1=Java, 2=PHP, 3=Go}

        // If key does not exist then returns the `null`.
        System.out.println(map.get(20)); // null

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*
OUTPUT
--------------------------------
{1=Java, 2=Python, 3=Go}
{1=Java, 2=PHP, 3=Go}
null
*/