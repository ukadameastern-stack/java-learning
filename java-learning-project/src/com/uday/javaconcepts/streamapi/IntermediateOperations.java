package com.uday.javaconcepts.streamapi;

import java.util.*;

public class IntermediateOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        list.stream()
                .filter(x -> x > 20)
                .map(x -> x * 2)
                .forEach(System.out::println);

        /*
        CONCEPT
        -------

        Intermediate operations return NEW STREAM.

        Types
        -----

        filter()
        Used to apply condition

        map()
        Used to transform element

        FLOW
        ----
        10 20 30 40 50
        filter >20
        30 40 50
        map *2
        60 80 100

        OUTPUT
        ------
        60
        80
        100
        */


        // distinct()

        List<Integer> dup = Arrays.asList(1,2,2,3,3);

        dup.stream().distinct().forEach(System.out::println);

        /*
        distinct() removes duplicates

        OUTPUT
        1
        2
        3
        */


        // sorted()

        List<Integer> nums = Arrays.asList(5,3,9,1);

        nums.stream().sorted().forEach(System.out::println);

        /*
        sorted() sorts elements

        OUTPUT
        1
        3
        5
        9
        */
    }
}