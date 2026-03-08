package com.uday.javaconcepts.polymorphism.methodoverloading.advanced;

public class AutoboxingExample {

    void display(Integer num) {
        System.out.println("Wrapper Integer method");
    }

    public static void main(String[] args) {

        AutoboxingExample obj = new AutoboxingExample();

        obj.display(10);   // primitive int → Integer

    }
}

/*
Details:
- Java automatically converts primitive int to Integer.
- This feature is called Autoboxing.

Output:
Wrapper Integer method
*/