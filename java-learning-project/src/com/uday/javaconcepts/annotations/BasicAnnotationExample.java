package com.uday.javaconcepts.annotations;

/*
=========================================================
JAVA ANNOTATIONS
=========================================================

Definition
-----------
Annotations in Java are special markers used to provide
metadata (information about the code).

Annotations do NOT directly change program behaviour.
Instead they give instructions to:

1. Compiler
2. JVM
3. Tools / Frameworks

Example frameworks using annotations:
Spring, Hibernate, JUnit.

---------------------------------------------------------
Common Built-in Annotations
---------------------------------------------------------

@Override
@Deprecated
@SuppressWarnings

---------------------------------------------------------
Example Explanation
---------------------------------------------------------

@Override tells the compiler that the method
is overriding a parent class method.

If it does not override correctly,
the compiler will produce an error.

*/

class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class BasicAnnotationExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();
    }
}

/*
OUTPUT
--------------------------------
Dog barks
*/