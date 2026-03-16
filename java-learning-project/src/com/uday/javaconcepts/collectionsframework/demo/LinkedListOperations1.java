package com.uday.javaconcepts.collectionsframework.demo;

import java.util.LinkedList;

public class LinkedListOperations1 {


    public static void main (String[] args) {
        LinkedList list = new LinkedList();

        list.add('A');
        list.add("Test string");
        list.add (12);
        list.add (3.14);
        list.add (15.4F);
        list.add (15L);
        list.add(new Student(101, "Uday"));

        System.out.println(list);

    }

}
