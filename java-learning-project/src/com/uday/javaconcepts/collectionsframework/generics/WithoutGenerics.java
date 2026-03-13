package com.uday.javaconcepts.collectionsframework.generics;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(10);   // allowed

        String s = (String) list.get(0);

        System.out.println(s);
    }
}