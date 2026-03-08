package com.uday.javaconcepts.polymorphism.methodoverloading.advanced;

public class WideningExample {

    void show(int num) {
        System.out.println("int method");
    }

    void show(double num) {
        System.out.println("double method");
    }

    public static void main(String[] args) {

        WideningExample obj = new WideningExample();

        obj.show(10);   // exact match
        obj.show(10.5);

    }
}

/*
Details:
- Java prefers exact match first.
- If exact match not available → widening happens.

Output:
int method
double method
*/