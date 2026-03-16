package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapOperations {

    public static void main(String[] args) {

//        HashMap<Object, Object> hashMap = new HashMap<>();
//
//        hashMap.put(1, "Two");
//        hashMap.put(3, 11);
//        hashMap.put(4, 12.20F);
//        hashMap.put(5, 1200L);
//        hashMap.put("long", 130L);
//        hashMap.put('A', "Amol");
//        hashMap.put('b', "Balaji");
//        hashMap.put('c', 15);
//
//        System.out.println(hashMap);
//
//        for (Object key : hashMap.keySet()) {
//            System.out.println(key + ": " + hashMap.get(key));
//        }
//
//        /*
//            o/p:
//
//            {1=Two, 3=11, 4=12.2, 5=1200, long=130}
//            1: Two
//            3: 11
//            4: 12.2
//            5: 1200
//            long: 130
//
//         */
//
//        LinkedHashMap<Object, Object> linkHashMap = new LinkedHashMap<>();
//
//        linkHashMap.put(1, "Two");
//        linkHashMap.put(3, 11);
//        linkHashMap.put(4, 12.20F);
//        linkHashMap.put(5, 1200L);
//        linkHashMap.put("long", 130L);
//        linkHashMap.put('A', "Amol");
//        linkHashMap.put('b', "Balaji");
//        linkHashMap.put('c', 15);
//
//        System.out.println(linkHashMap);
//        // {1=Two, 3=11, 4=12.2, 5=1200, long=130, A=Amol, b=Balaji, c=15}
//
//        for (Object key : linkHashMap.keySet()) {
//            System.out.println(key + ": " + linkHashMap.get(key));
//        }
        /*
            1: Two
            3: 11
            4: 12.2
            5: 1200
            long: 130
            A: Amol
            b: Balaji
            c: 15
         */

        // ClassCastException
//        TreeMap<Object, Object> treeMap = new TreeMap<>();
//
//        treeMap.put(1, "Two");
//        treeMap.put(3, 11);
//        treeMap.put(4, 12.20F);
//        treeMap.put(5, 1200L);
//        treeMap.put("long", 130L); // ClassCastException
//        treeMap.put('A', "Amol");
//        treeMap.put('b', "Balaji");
//        treeMap.put('c', 15);
//
//        System.out.println(treeMap);

        // How to fix this?
        // Option 1 — Use Same Key Type (Recommended)
        TreeMap<Integer, Object> treeMap = new TreeMap<>(); // Change

        treeMap.put(1, "Two");
        treeMap.put(3, 11);
        treeMap.put(4, 12.20F);
        treeMap.put(5, 1200L);
        treeMap.put(6, 130L); // Change
        treeMap.put(8, "Amol"); // Change
        treeMap.put(9, "Balaji"); // Change
        treeMap.put(2, 15); // Change

        System.out.println(treeMap);
        // {1=Two, 2=15, 3=11, 4=12.2, 5=1200, 6=130, 8=Amol, 9=Balaji}

        // Option 2 — Convert Keys to String
        TreeMap<String, Object> treeMap2 = new TreeMap<>();

        treeMap2.put(String.valueOf(1), "Two");
        treeMap2.put("3", 11);
        treeMap2.put(String.valueOf(4), 12.20F);
        treeMap2.put(String.valueOf(5), 1200L);
        treeMap2.put("long", 130L); // ClassCastException
        treeMap2.put(String.valueOf('A'), "Amol");
        treeMap2.put("b", "Balaji");
        treeMap2.put(String.valueOf('C'), 15);

        System.out.println(treeMap2);
        // Key order: 0-9 -> A-Z -> a-z
        // {1=Two, 3=11, 4=12.2, 5=1200, A=Amol, C=15, b=Balaji, long=130}
    }
}