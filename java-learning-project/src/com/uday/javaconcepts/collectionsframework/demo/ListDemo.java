package com.uday.javaconcepts.collectionsframework.demo;

import java.util.ArrayList;

/*
    Dealing with more that one values/Objects/Elemments.
    java.util.
 */
public class ListDemo {
    public static void main(String[] args) {
        String[] name = new String[10];
        name[0] = "Amol";
        name[1] = "Daniel";
        name[2] = "Deepak";
        name[3] = "James";
        name[4] = "Jack";
        name[5] = "Jimit";
        name[6] = "Jonathan";
        name[7] = "Jennifer";
        name[8] = "John";
        name[9] = "Michael";
        // So here once we initialized array with size, then it will not allow to add value more than it's length.
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        // name[10] = "Michael"; This issue was resolved in List

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }


        // list: Can we create the object of it? : No, it's Interface.
        ArrayList<String> names = new ArrayList<>(); // not defined size.
        names.add("Amol");
        names.add("Daniel");
        names.add("Deepak");
        names.add("James");
        names.add("Jonathan");
        names.add("Jennifer");
        names.add("John");
        names.add("Michael");
        names.add("Johny");
        names.add("Uday");
        names.add("Vijay");

        System.out.println(names);
    }
}
