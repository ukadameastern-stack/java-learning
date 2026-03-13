package com.uday.javaconcepts.collectionsframework.demo;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListOperations3 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(6);
        list1.add(8);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        System.out.println("List 1 : Size: " + list1.size() + " : " + list1);

        ArrayList<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(6);
        list2.add(4);
        list2.add(8);
        list2.add(4);
        list2.add(5);

        System.out.println("List 2 : Size: " + list2.size() + " : " + list2);

        // Remove values from list1 which are common/matching to list2
        System.out.println("=======Remove values from list1 which are common/matching to list2========");
        list1.removeAll(list2);
        System.out.println("List 1 : Size: " + list1.size() + " : " + list1);
        System.out.println("List 2 : Size: " + list2.size() + " : " + list2);


    }
}
/*
o/p:

List 1 : Size: 6 : [1, 6, 8, 3, 2, 1]
List 2 : Size: 6 : [1, 6, 4, 8, 4, 5]
=======Remove values from list1 which are common/matching to list2========
List 1 : Size: 2 : [3, 2]
List 2 : Size: 6 : [1, 6, 4, 8, 4, 5]
 */