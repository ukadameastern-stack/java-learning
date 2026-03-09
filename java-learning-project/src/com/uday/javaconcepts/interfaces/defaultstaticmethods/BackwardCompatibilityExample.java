package com.uday.javaconcepts.interfaces.defaultstaticmethods;

/*
=========================================================
BACKWARD COMPATIBILITY IN JAVA INTERFACES
=========================================================

Before Java 8
-------------
Interfaces could only contain:

1. Abstract methods
2. Public static final variables (constants)

Problem
-------
If we add a new method to an existing interface,
ALL implementing classes must implement that method.

Otherwise the code will break.

Example:

interface Vehicle
{
   void start();
}

If we later add:

void stop();

Then all existing classes implementing Vehicle
will fail to compile.

Solution Introduced in Java 8
------------------------------

Java introduced:

1. Default Methods
2. Static Methods

These allow adding new methods to interfaces
WITHOUT breaking existing implementations.

This concept is called:

BACKWARD COMPATIBILITY

Meaning:
Older classes continue to work without modification.

*/

interface Vehicle {

    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike started");
    }
}

public class BackwardCompatibilityExample {

    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.start();
        bike.stop(); // default method from interface
    }
}

/*
OUTPUT
--------------------------------
Bike started
Vehicle stopped
*/