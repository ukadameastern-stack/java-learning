package com.uday.javaconcepts.functionalinterfaces;

import java.util.function.Supplier;

/*
=========================================================
SUPPLIER<T>
=========================================================

Definition
-----------
Represents a supplier of results.

It takes no input and returns a value.

Method
------
T get()

Real-world use
    Generating IDs
    Providing configuration values
    Lazy loading
    Random data generation

Example:

    Supplier<UUID> uuidGenerator = () -> UUID.randomUUID();
*/

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> randomNumber =
                () -> Math.random();

        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
    }
}

/*
OUTPUT
-------------------------
0.53
0.82
(random values)
*/