package com.uday.javaconcepts.optional;

import java.util.Optional;

public class OptionalBasicExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Uday");

        System.out.println(name.get()); // avoid in real-world unless sure

        Optional<String> empty = Optional.empty();

        System.out.println(empty.isPresent()); // false
    }
}

/*
OUTPUT:
Uday
false
*/