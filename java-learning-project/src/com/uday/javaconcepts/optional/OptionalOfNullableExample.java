package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.ofNullable()
=========================================================

Used when value may be null.

If value is null → Optional.empty
If value exists → Optional[value]
*/

public class OptionalOfNullableExample {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        System.out.println(optionalName);
    }
}

/*
OUTPUT
--------------------------------
Optional.empty
*/