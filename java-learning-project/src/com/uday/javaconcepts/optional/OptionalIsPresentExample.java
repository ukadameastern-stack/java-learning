package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.isPresent()
=========================================================

Checks if a value exists inside Optional.
*/

public class OptionalIsPresentExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Java");

        if (name.isPresent()) {
            System.out.println("Value: " + name.get());
        }
    }
}

/*
OUTPUT
--------------------------------
Value: Java
*/