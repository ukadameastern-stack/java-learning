package com.uday.javaconcepts.functionalinterfaces;

/*
=========================================================
FUNCTIONAL INTERFACE IN JAVA
=========================================================

Definition
-----------
A Functional Interface is an interface that contains
ONLY ONE abstract method.

It may contain:

1 abstract method
multiple default methods
multiple static methods

SAM (Single Abstract Method ) interfaces

Java introduced this concept mainly for
Lambda Expressions.

Annotation used:
@FunctionalInterface

This annotation is optional but recommended.
Compiler throws error if more than one abstract method exists.
*/

@FunctionalInterface
interface Greeting {

    void sayHello(String name); // single abstract method
}

public class  FunctionalInterfaceExample {

    public static void main(String[] args) {

        Greeting g = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        g.sayHello("Uday");
    }
}

/*
OUTPUT
--------------------------------
Hello Uday
*/