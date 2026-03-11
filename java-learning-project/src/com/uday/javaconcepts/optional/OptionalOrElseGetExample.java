package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.orElseGet()
=========================================================

Used when default value should be
generated using a Supplier.
*/

public class OptionalOrElseGetExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        String result = name.orElseGet(() -> "Generated Name");

        System.out.println(result);
    }
}

/*
OUTPUT
--------------------------------
Generated Name
*/