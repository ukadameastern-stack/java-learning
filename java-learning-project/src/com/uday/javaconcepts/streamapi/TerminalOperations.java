package com.uday.javaconcepts.streamapi;

import java.util.*;

public class TerminalOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40);


        // count()

        long count = list.stream().count();

        System.out.println(count);

        /*
        Terminal operation ends the stream pipeline
        */

        // OUTPUT: 4


        // findFirst()

        Optional<Integer> first =
                list.stream().findFirst();

        System.out.println(first); // Optional[10]
        System.out.println(first.get()); // 10

        // OUTPUT: 10


        // anyMatch()

        boolean result =
                list.stream().anyMatch(x -> x > 25);

        System.out.println(result);

        // OUTPUT: true
    }
}