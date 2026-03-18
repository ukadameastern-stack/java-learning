package com.uday.javaconcepts.streamapi;

import java.util.*;

public class StreamInterviewProblems {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,10,15,20,25);

        // Find even numbers

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        /*
        OUTPUT
        10
        20
        */


        // Find max number

        int max = list.stream()
                .max(Integer::compare)
                .get();

        System.out.println(max);

        // OUTPUT: 25


        // Find second-highest number

        int second =
                list.stream()
                        .sorted((a,b)->b-a)
                        .skip(1)
                        .findFirst()
                        .get();

        System.out.println(second);

        // OUTPUT: 20
    }
}