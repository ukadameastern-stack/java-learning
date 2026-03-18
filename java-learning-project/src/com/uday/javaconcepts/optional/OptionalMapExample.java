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

        Optional<String> name = Optional.of("Java");

        Optional<String> upper =
                name.map(String::toUpperCase);

        System.out.println(upper);
        System.out.println(name.map(n -> n.toLowerCase()));
    }
}

/*
OUTPUT
--------------------------------
Optional[JAVA]
Optional[java]
*/