package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;

public class ArrayListOperations4 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(6);
        list1.add(8);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(1);

        System.out.println("List 1 : Size: " + list1.size() + " : " + list1);

        ArrayList<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(6);
        list2.add(4);
        list2.add(8);

        System.out.println("List 2 : Size: " + list2.size() + " : " + list2);

        System.out.println("======= Search a value is available/present or not in the list ========");
        System.out.println("3 is present in the List1: " + list1.contains(3));
        System.out.println("10 is present in the List1: " + list1.contains(10));

        System.out.println("======= Search all the values from List2 is present in the List1 ========");
        System.out.println(list1.containsAll(list2));

        System.out.println("======= Check list3 is empty ========");
        ArrayList<Integer> list3 = new ArrayList();
        if (list3.isEmpty()) {
            System.out.println("List3 is empty: .isEmpty()");
        }
        if (list3.size() == 0) {
            System.out.println("List3 is empty: .size() == 0");
        }
    }
}

/*
o/p:


 */