package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.*;

public class StreamCreationExamples {

    public static void main(String[] args) {

        // 1. From Collection
        List<String> list = List.of("Java", "Spring", "Docker");

        //list.stream().forEach(l -> System.out.println("LE: " + l)); Normal way
        list.stream().forEach(System.out::println);

        /*
        OUTPUT
        Java
        Spring
        Docker
        */


        // 2. From Array
        int[] arr = {10,20,30};

        Arrays.stream(arr).forEach(System.out::println);

        /*
        OUTPUT
        10
        20
        30
        */


        // 3. Using Stream.of()
        Stream<String> stream = Stream.of("A","B","C");

        stream.forEach(System.out::println);

        /*
        OUTPUT
        A
        B
        C
        */
    }
}