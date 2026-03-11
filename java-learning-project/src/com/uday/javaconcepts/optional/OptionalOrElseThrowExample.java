package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
Optional.orElseThrow()
=========================================================

Throws exception if value is absent.
*/

public class OptionalOrElseThrowExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        String value = name.orElseThrow(
                () -> new RuntimeException("Value not found"));

        System.out.println(value);
    }
}

/*
OUTPUT
--------------------------------
Exception in thread "main"
java.lang.RuntimeException: Value not found
*/