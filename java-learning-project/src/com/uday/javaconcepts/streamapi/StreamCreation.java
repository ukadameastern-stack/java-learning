package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.*;

public class StreamCreation {

    public static void main(String[] args) {

        // 1. From Collection
        List<String> list = List.of("Java","Spring","Docker");

        list.stream().forEach(System.out::println);

        /*
        CONCEPT
        -------
        stream() converts collection into Stream pipeline
        */

        // 2. From Array
        int arr[] = {10,20,30};

        Arrays.stream(arr).forEach(System.out::println);

        /*
        CONCEPT
        -------
        Arrays.stream() converts array into stream
        */

        // 3. Stream.of()

        Stream<Integer> stream = Stream.of(1,2,3);

        stream.forEach(System.out::println);

        /*
        CONCEPT
        -------
        Stream.of() creates stream directly from elements
        */
    }
}