package com.uday.javaconcepts.streamapi;

import java.util.*;

public class StreamConcept {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40);

        list.stream().forEach(System.out::println);

        /*
        CONCEPT
        -------
        Stream is a sequence of elements supporting functional operations.

        Important Points
        ----------------
        1. Stream does NOT store data
        2. Stream processes data from source (Collection, Array)
        3. Stream operations are lazy
        4. Stream cannot be reused
        5. Stream supports functional programming

        OUTPUT
        ------
        10
        20
        30
        40
        */
    }
}