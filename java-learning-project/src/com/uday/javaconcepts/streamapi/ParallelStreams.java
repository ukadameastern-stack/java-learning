package com.uday.javaconcepts.streamapi;

import java.util.*;

public class ParallelStreams {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.parallelStream()
                .forEach(System.out::println);

        /*
        parallelStream()

        Executes operations in multiple threads.

        NOTE
        Order is NOT guaranteed.

        OUTPUT example
        3
        5
        1
        4
        2
        */
    }
}