package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;

public class ArrayListOperations7 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass() == list2.getClass());
    }
}

/*
o/p:

true
 */