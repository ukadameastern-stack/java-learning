package com.uday.javaconcepts.optionalstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalStreamExample3 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit", "Uday", "Raj");

        Optional<String> result =
                names.stream()
                        .filter(name -> name.startsWith("U"))
                        .findFirst();

        result.ifPresent(System.out::println);
    }
}

/*
OUTPUT:
Uday
*/