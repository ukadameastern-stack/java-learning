package com.uday.javaconcepts.interfaces.defaultstaticmethods;

/*
=========================================================
STATIC METHODS IN INTERFACES
=========================================================

Java 8 introduced Static Methods inside interfaces.

These methods belong to the interface itself,
NOT to the implementing classes.

Important Rule
--------------
Static methods must be called using
the interface name.

---------------------------------------------------------

Syntax

static returnType methodName()
{
   method body
}

*/

interface MathUtility {

    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodInterfaceExample {

    public static void main(String[] args) {

        int result = MathUtility.add(10, 20);

        System.out.println("Result: " + result);
    }
}

/*
OUTPUT
--------------------------------
Result: 30
*/