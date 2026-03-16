package com.uday.javaconcepts.collectionsframework.demo;

import java.util.Hashtable;

public class HashTable1 {

    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "one");
        hashTable.put(2, "two");
        hashTable.put(3, "three");
        hashTable.put(4, "four");
        hashTable.put(5, "five");
        hashTable.put(6, "six");
        hashTable.put(6, "six1");
        // In Hash  table null is not allows as key or value
        // hashTable.put(6, null); // NullPointerException
        // hashTable.put(null, "seven");// NullPointerException


        System.out.println(hashTable);


    }
}
