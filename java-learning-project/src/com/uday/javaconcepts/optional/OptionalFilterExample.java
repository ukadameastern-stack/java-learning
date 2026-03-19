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

        Optional<Integer> age = Optional.of(25);

        age.filter(a -> a >= 18)
                .ifPresent(a -> System.out.println("Age " + a +" eligible for voting"));

        Optional<Integer> age2 = Optional.of(15);

        age2.filter(a -> a >= 18)
                .ifPresent(a -> System.out.println("Won't print"));
    }
}

/*
OUTPUT
--------------------------------
Optional[Java]
*/