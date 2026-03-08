package com.uday.javaconcepts.polymorphism.methodoverloading;

public class TypePromotionExample {

    void show(int num) {
        System.out.println("Integer method called");
    }

    void show(double num) {
        System.out.println("Double method called");
    }

    public static void main(String[] args) {

        TypePromotionExample obj = new TypePromotionExample();

        obj.show(5);      // exact match
        obj.show(5.5);    // double

    }
}

/*
Details:
- Java selects the most specific method.
- If exact match is not available, type promotion happens.

Output:
Integer method called
Double method called
*/