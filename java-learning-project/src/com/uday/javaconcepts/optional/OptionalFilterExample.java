package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.filter()
=========================================================

Filters the value using Predicate.
*/

public class OptionalFilterExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Java");

        Optional<String> result =
                name.filter(n -> n.startsWith("J")); // Optional[Java]
                // name.filter(n -> n.startsWith("j")); // Optional.empty
                // name.filter(n -> n.startsWith("v")); // Optional.empty

        System.out.println(result);
    }
}

/*
OUTPUT
--------------------------------
Optional[Java]
*/