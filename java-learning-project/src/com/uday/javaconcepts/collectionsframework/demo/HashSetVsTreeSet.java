package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetVsTreeSet {

    public static void main(String[] args) {

        HashSet<String> hSet= new HashSet<>();
        hSet.add("Balaji");
        hSet.add("Balaji");
        hSet.add("Amol");
        hSet.add("Chandra");
        hSet.add("Deva");

        System.out.println(hSet);

        TreeSet<String> tSet= new TreeSet<>();
        tSet.add("Balaji");
        tSet.add("Balaji");
        tSet.add("Deva");
        tSet.add("Amol");
        tSet.add("Chandra");

        System.out.println(tSet);

        hSet.clear();
        tSet.clear();

    }
}
