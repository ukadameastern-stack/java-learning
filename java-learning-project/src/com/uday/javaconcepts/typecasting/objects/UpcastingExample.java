package com.uday.javaconcepts.typecasting.objects;

/*
=========================================================
UPCASTING IN JAVA
=========================================================

Definition
-----------
Upcasting means converting a Child class object reference
into a Parent class reference.

Child → Parent

This happens automatically, so it is also called
IMPLICIT OBJECT TYPE CASTING.

---------------------------------------------------------
Why Upcasting?
---------------------------------------------------------

1. Achieve Runtime Polymorphism
2. Write flexible and reusable code
3. Follow OOP design principles

---------------------------------------------------------
Important Point
---------------------------------------------------------

When Upcasting happens:

Parent reference = Child object

The parent reference can only access
methods/variables defined in the parent class.

Even though the object belongs to child class.

*/

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpcastingExample {

    public static void main(String[] args) {

        // Upcasting
        Animal animal = new Dog();

        animal.sound();

        // animal.bark();  // NOT allowed : java: cannot find symbol
    }
}

/*
OUTPUT
--------------------------------
Animal makes a sound
*/