package com.uday.javaconcepts.collectionsframework.demo;

import java.util.LinkedList;

public class LinkedListOperations2 {


    public static void main (String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add (12);
        list.add (1);
        list.add (4);
        list.add (6);

        System.out.println(list);
        list.add (1, 3);
        System.out.println(list);
        System.out.println(list.contains(6));
        System.out.println(list.contains(10));
        list.addAll(list);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.toArray());

    }

}
