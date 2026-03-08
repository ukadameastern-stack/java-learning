package com.uday.javaconcepts.finalkeyword;

final class Vehicle {

    void display() {
        System.out.println("This is a final class");
    }
}

// class Car extends Vehicle { }
// ❌ Compile-time error
// Final class cannot be inherited
// java: cannot inherit from final com.uday.javaconcepts.finalkeyword.Vehicle

public class FinalClassExample {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.display();
    }
}

/*
Details:
- final class cannot be extended.
- Used for security and immutability.

Example in Java:
String class is final.

Output:
This is a final class
*/