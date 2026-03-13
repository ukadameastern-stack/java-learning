package com.uday.javaconcepts.collectionsframework.generics;

public class GenericMethodExample {
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        printValue("Java");
        printValue(100);
        printValue(3.14);
    }
}

/*
o/p:
Java
100
3.14
 */