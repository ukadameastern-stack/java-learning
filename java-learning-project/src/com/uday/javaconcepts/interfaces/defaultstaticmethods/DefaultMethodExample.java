package com.uday.javaconcepts.interfaces.defaultstaticmethods;

/*
=========================================================
DEFAULT METHODS IN INTERFACES
=========================================================

Definition
-----------
Default methods are methods defined inside interfaces
with a method body using the keyword:

default

These methods are NOT abstract.

They provide a default implementation that
implementing classes can use or override.

---------------------------------------------------------

Syntax

default returnType methodName()
{
    method body
}

---------------------------------------------------------

Key Points

1. Introduced in Java 8
2. Helps achieve backward compatibility
3. Can be overridden by implementing class
4. Must use keyword "default"

*/

interface Calculator {

    default void showMessage() {
        System.out.println("Welcome to Calculator");
    }
}

class MyCalculator implements Calculator {

}

public class DefaultMethodExample {

    public static void main(String[] args) {

        MyCalculator obj = new MyCalculator();

        obj.showMessage();
    }
}

/*
OUTPUT
--------------------------------
Welcome to Calculator
*/