package com.uday.javaconcepts.finalandabstract;

abstract class Animal {

    abstract void sound();
}

// final class Dog extends Animal { }
// ❌ Compile-time error because abstract method must be implemented

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractVsFinalClassExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}

/*
Details:

Abstract Class
--------------
- Can contain abstract methods
- Must be extended by subclasses
- Cannot create object

Final Class
-----------
- Cannot be extended
- Used to prevent inheritance

Important Rule:
A class cannot be both abstract and final.

Output:
Dog barks
*/