package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.orElse()
=========================================================

Returns the value if present
otherwise returns default value.
*/

public class OptionalOrElseExample {

    public static void main(String[] args) {

        String name = "";

        Optional<String> optionalName = Optional.ofNullable(name);

        String result = optionalName.orElse("Default Name");

        System.out.println(result);

        Integer age = null;

        Optional<Integer> optionalAge = Optional.ofNullable(age);

        Integer resultAge = optionalAge.orElse(1);
        // If age = null, then o/p : 1
        // If age = 25, then o/p : 25

        System.out.println(resultAge);
    }
}

/*
OUTPUT
--------------------------------
USK
1
*/