package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.map()
=========================================================

Transforms the value if present.
*/

public class OptionalMapExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("java");

        Optional<String> upper =
                name.map(String::toUpperCase);

        System.out.println(upper);
    }
}

/*
OUTPUT
--------------------------------
Optional[JAVA]
*/