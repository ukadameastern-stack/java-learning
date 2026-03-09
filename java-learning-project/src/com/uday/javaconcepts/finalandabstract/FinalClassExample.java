package com.uday.javaconcepts.finalandabstract;

final class Vehicle {

    void display() {
        System.out.println("Vehicle class method");
    }
}

// class Car extends Vehicle { }
// ❌ Compile-time error
// Final class cannot be inherited

public class FinalClassExample {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.display();

    }
}

/*
Details:
- A final class cannot be extended.
- It prevents inheritance.

Example from Java:
String class is final.

Output:
Vehicle class method
*/