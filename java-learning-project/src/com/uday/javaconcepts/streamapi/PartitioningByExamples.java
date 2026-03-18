package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class PartitioningByExamples {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,20,25,30);

        Map<Boolean,List<Integer>> map =
                list.stream()
                        .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(map);

        /*
        partitioningBy()

        Splits data into two groups

        true  -> even numbers
        false -> odd numbers

        OUTPUT

        true=[10,20,30]
        false=[15,25]
        */
    }
}