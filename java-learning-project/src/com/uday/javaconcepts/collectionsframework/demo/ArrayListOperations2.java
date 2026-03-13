package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;

public class ArrayListOperations2 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        list1.add("Six");

        System.out.println("Size: " + list1.size() + " : " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Eight");

        System.out.println("Size: " + list2.size() + " : " + list2);

        // In list2 add list1 data.
        System.out.println("===== In list2 add list1 data.======");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        list2.addAll(list1);
        System.out.println("List 2 Size: " + list2.size() + " : " + list2);

        // In list1 add list2 data at index :2 .
        System.out.println("======= In list1 add list2 data at index :2 =======");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        list1.addAll(2, list2);
        System.out.println("List1 Size: " + list1.size() + " : " + list1);

    }
}
