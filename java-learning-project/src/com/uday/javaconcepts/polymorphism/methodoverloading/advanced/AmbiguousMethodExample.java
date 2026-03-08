package com.uday.javaconcepts.polymorphism.methodoverloading.advanced;

public class AmbiguousMethodExample {

    void show(int a, float b) {
        System.out.println("Method 1");
    }

    void show(float a, int b) {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {

        AmbiguousMethodExample obj = new AmbiguousMethodExample();

        // obj.show(10, 10); // Java: reference to show is ambiguous

    }
}

/*
Details:
- Both methods require type conversion.
- Java cannot decide which method to call.

Result:
Compile-time error: ambiguous method call
*/