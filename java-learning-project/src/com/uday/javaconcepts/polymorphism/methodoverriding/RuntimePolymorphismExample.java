package com.uday.javaconcepts.polymorphism.methodoverriding;

class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {

    @Override
    void run() {
        System.out.println("Car is running safely");
    }
}

public class RuntimePolymorphismExample {

    public static void main(String[] args) {

        Vehicle v = new Car();   // parent reference

        v.run();
    }
}

/*
Details:
- Parent reference pointing to child object.
- Method call is resolved at runtime.

Output:
Car is running safely
*/