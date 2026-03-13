package com.uday.javaconcepts.collectionsframework.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");

        printList(names);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);

        printList(numbers);
    }
}

/*
o/p:

John
Jane
1
2

 */