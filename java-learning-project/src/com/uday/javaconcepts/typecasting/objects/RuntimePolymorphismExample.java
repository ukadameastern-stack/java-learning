package com.uday.javaconcepts.typecasting.objects;

/*
=========================================================
RUNTIME POLYMORPHISM USING UPCASTING
=========================================================

Upcasting enables Runtime Polymorphism.

Even though reference type is Parent,
method execution depends on the actual
object type at runtime.

This is called:

Dynamic Method Dispatch

*/

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class RuntimePolymorphismExample {

    public static void main(String[] args) {

        Vehicle v = new Car();   // Upcasting

        v.start(); // Car starts with key
    }
}

/*
OUTPUT
--------------------------------
Car starts with key
*/