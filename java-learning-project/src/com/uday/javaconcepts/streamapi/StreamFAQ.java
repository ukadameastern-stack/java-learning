package com.uday.javaconcepts.streamapi;

import java.util.*;

public class StreamFAQ {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Q1 Can Stream be reused?

        var stream = list.stream();

        stream.forEach(System.out::println);
        // Exception in thread "main" java.lang.IllegalStateException:
        // stream has already been operated upon or closed
        // stream.forEach(System.out::println);

        /*
        If we try again

        stream.forEach()

        ERROR
        -----
        Stream already consumed
        */


        // Q2 Difference between map and filter

        list.stream()
                .filter(x -> x > 2)
                .map(x -> x * 10)
                .forEach(System.out::println);

        /*
        filter -> condition
        map -> transformation

        OUTPUT
        30
        40
        50
        */
    }
}