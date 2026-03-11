package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.ifPresent()
=========================================================

Executes a lambda only if value exists.
*/

public class OptionalIfPresentExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Spring");

        name.ifPresent(n -> System.out.println("Value: " + n));
    }
}

/*
OUTPUT
--------------------------------
Value: Spring
*/