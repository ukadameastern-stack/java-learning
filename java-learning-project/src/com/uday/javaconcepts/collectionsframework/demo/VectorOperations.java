package com.uday.javaconcepts.collectionsframework.demo;

import java.util.Vector;

public class VectorOperations {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Vija");
        vector.add("Uday");
        vector.add("Kadam");

        System.out.println(vector);

        for(String s : vector){
            System.out.println(s + " : " + s.hashCode());
        }

    }
}
/*
o/p:

[Vija, Uday, Kadam]
Vija : 2666314
Uday : 2631463
Kadam : 72253018

 */