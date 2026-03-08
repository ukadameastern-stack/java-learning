package com.uday.javaconcepts.polymorphism.methodoverloading.advanced;

public class WideningVsBoxingExample {

    void show(long num) {
        System.out.println("Widening method");
    }

    void show(Integer num) {
        System.out.println("Autoboxing method");
    }

    public static void main(String[] args) {

        WideningVsBoxingExample obj = new WideningVsBoxingExample();

        obj.show(10);

    }
}

/*
Details:
- int → long (widening)
- int → Integer (boxing)

Priority:
Widening > Boxing

Output:
Widening method
*/