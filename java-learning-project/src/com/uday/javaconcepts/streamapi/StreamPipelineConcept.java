package com.uday.javaconcepts.streamapi;

import java.util.*;

public class StreamPipelineConcept {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,10,15,20,25);

        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .sorted()
                .forEach(System.out::println);

        /*
        STREAM PIPELINE

        Source → Intermediate → Terminal

        Source
        ------
        List

        Intermediate
        ------------
        filter
        map
        sorted

        Terminal
        --------
        forEach

        FLOW

        5 10 15 20 25
        filter >10
        15 20 25
        map *2
        30 40 50
        sorted
        30 40 50

        OUTPUT
        30
        40
        50
        */
    }
}