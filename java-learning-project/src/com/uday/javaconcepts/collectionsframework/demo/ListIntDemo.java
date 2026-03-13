package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntDemo {
    public static void main(String[] args) {

        // All types of data stored.
        // No type safety
        ArrayList typesOfData = new ArrayList();
        typesOfData.add(10.99);
        typesOfData.add('A');
        typesOfData.add(true);
        typesOfData.add(50);
        typesOfData.add(new ArrayList<>());
        typesOfData.add("Uday");
        typesOfData.add(new Student());
        typesOfData.add(new ArrayIndexOutOfBoundsException());
        typesOfData.add(new int[]{20, 33, 44});

        System.out.println(typesOfData);
        System.out.println(typesOfData.get(6) );

        // Type safety with limited element
        int[] marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        // java: incompatible types: java.lang.String cannot be converted to int
        // marks[2] = "uday";
        System.out.println(Arrays.toString(marks));

        ArrayList<Integer> marks1 = new ArrayList<>();
        marks1.add(20);
        marks1.add(30);
        marks1.add(40);
        marks1.add(20);
        marks1.add(20);
        System.out.println(marks1);

        ArrayList<Character> c = new ArrayList<>();
        c.add('A');
        c.add('B');
        c.add('C');

        System.out.println(c);
    }
}

/*
o/p:
[10.99, A, true, 50, [], Uday, com.uday.javaconcepts.collectionsframework.demo.Student@5f184fc6, java.lang.ArrayIndexOutOfBoundsException, [I@3feba861]
com.uday.javaconcepts.collectionsframework.demo.Student@5f184fc6
[1, 2, 3]
[20, 30, 40, 20, 20]
[A, B, C]
 */