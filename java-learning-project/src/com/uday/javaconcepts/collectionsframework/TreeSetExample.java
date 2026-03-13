package com.uday.javaconcepts.collectionsframework;

import java.util.TreeSet;

/*
=========================================================
TREESET
=========================================================

    TreeSet stores elements in sorted order.

Features
--------
    1 No duplicates
    2 Automatically sorted
    3 Uses Red-Black Tree internally
*/

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);

        System.out.println(set);
        System.out.println("Get first: " + set.getFirst());
        System.out.println("Get last: " + set.getLast());
        // System.out.println("Get last: " + set.get(2)); // java: cannot find symbol
    }
}

/*
OUTPUT
--------------------------------
[10, 30, 50]
Get first: 10
Get last: 50
*/