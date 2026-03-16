package com.uday.javaconcepts.collectionsframework.demo;

import java.util.*;

public class MapIterations2 {

    public static void main(String[] args) {

        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");
        fruits.put(4, "Strawberry");


        HashMap<Integer, String> fruits2 = new HashMap<>();
        fruits2.put(5, "Pineapple");
        fruits2.put(4, "Grapes");
        fruits.putAll(fruits2);

        fruits.putIfAbsent(6, "Pineapple");

        System.out.println("===========entrySet===========");
        for (HashMap.Entry<Integer, String> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("===========entrySet Sets===========");
        Set<Map.Entry<Integer, String>> sets = fruits.entrySet();

        for (Map.Entry<Integer, String> set: sets) {
            System.out.println(set.getKey() + " : " + set.getValue());
        }

        System.out.println("===========keySet===========");
        for (Integer key : fruits.keySet()) {
            System.out.println(key + " : " + fruits.get(key));
        }

    }
}
