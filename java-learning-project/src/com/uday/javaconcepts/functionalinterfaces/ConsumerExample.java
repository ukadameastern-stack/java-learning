package com.uday.javaconcepts.functionalinterfaces;

import java.util.function.Consumer;

/*
=========================================================
CONSUMER<T>
=========================================================

Definition
-----------
Represents an operation that accepts
a single input argument and returns no result.

Method
------
void accept(T t)

Real-world use
Commonly used for:

    Logging
    Printing
    Saving data
    Sending events

Example with collection:

    names.forEach(name -> System.out.println(name));
*/

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printer =
                (name) -> System.out.println("Hello " + name);

        printer.accept("Uday");
        printer.accept("Java");
    }
}

/*
OUTPUT
-------------------------
Hello Uday
Hello Java
*/