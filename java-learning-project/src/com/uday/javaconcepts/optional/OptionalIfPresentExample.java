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


        String name2 = null;

        Optional<String> opName = Optional.ofNullable(name2);
        opName.ifPresentOrElse(
                n -> System.out.println("Value: " + n),
                () -> System.out.println("No value")
        );
    }
}

/*
OUTPUT
--------------------------------
Value: Spring
*/