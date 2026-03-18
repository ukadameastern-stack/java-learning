package com.uday.javaconcepts.streamapi;

import java.util.*;

public class ReduceOperation {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40);

        int sum = list.stream()
                .reduce(0, (a,b) -> a + b);

        System.out.println(sum);

        /*
        reduce()

        Used for aggregation operations.

        FLOW
        ----

        0 + 10 = 10
        10 + 20 = 30
        30 + 30 = 60
        60 + 40 = 100

        OUTPUT
        100
        */
    }
}