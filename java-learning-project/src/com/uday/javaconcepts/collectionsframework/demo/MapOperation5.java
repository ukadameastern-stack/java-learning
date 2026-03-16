package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashMap;
import java.util.Map;

public class MapOperation5 {

    public static void main(String[] args) throws Exception {

        Map<String,String> map = new HashMap<>();
        map.put("Uday", "Kadam");
        map.put("Vijay", "VKadam");
        map.put("Amol", "AKadam");
        map.put("A", "AKadam");

        System.out.println(map.get("Amol")); // AKadam
        System.out.println(map.get("Sachin")); // Null
        System.out.println(map.getOrDefault("Sachin", "Not found")); // Not found

    }
}

/*
o/p:

AKadam
null
Not found
 */