package com.uday.javaconcepts.optional;

import java.util.Optional;

public class OptionalAvoidNullCheckExample {

    public static void main(String[] args) {

        String email = null;

        // OLD WAY
        if (email != null) {
            System.out.println(email.toLowerCase());
        }

        // MODERN WAY
        Optional.ofNullable(email)
                .map(String::toLowerCase)
                .ifPresent(System.out::println);
    }
}

/*
OUTPUT:
(no output)
*/