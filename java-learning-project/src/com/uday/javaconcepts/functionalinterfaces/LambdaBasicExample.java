package com.uday.javaconcepts.functionalinterfaces;

/*
=========================================================
LAMBDA EXPRESSION
=========================================================

Definition
-----------
Lambda expression is a short way to implement
a functional interface.

It replaces anonymous classes.

Syntax
------

(parameters) -> { body }

Example:
(name) -> System.out.println(name)

Lambda was introduced in Java 8.
Still heavily used in Java 21.
*/

@FunctionalInterface
interface MessagePrinter {
    void printMessage(String msg);
}

public class LambdaBasicExample {

    public static void main(String[] args) {

        MessagePrinter printer =
                (msg) -> System.out.println("Message: " + msg);

        printer.printMessage("Welcome to Java 21 Lambda");

        MessagePrinter p = (msg) -> {
            System.out.println("Message: " + msg);
            System.out.println("Message: Length " + msg.length());
        };

        p.printMessage("Java 21 Lambda");
    }
}

/*
OUTPUT
--------------------------------
Message: Welcome to Java 21 Lambda
Message: Java 21 Lambda
Message: Length 14
*/