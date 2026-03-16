package com.uday.javaconcepts.collectionsframework.demo;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // Null key and value are not allowed.
        // map.put(4, null); // NullPointerException
        // map.put(null, "four"); // NullPointerException

        System.out.println(map);

    }
}
