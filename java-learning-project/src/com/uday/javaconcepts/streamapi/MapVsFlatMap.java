package com.uday.javaconcepts.streamapi;

import java.util.*;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(
                Arrays.asList("Java","Spring"),
                Arrays.asList("Docker","Kubernetes")
        );

        // map()

        list.stream()
                .map(x -> x)
                .forEach(System.out::println);

        /*
        map() returns Stream<List<String>>

        OUTPUT
        [Java, Spring]
        [Docker, Kubernetes]
        */


        // flatMap()

        list.stream()
                .flatMap(x -> x.stream())
                .forEach(System.out::println);

        /*
        flatMap() flattens nested structure

        OUTPUT
        Java
        Spring
        Docker
        Kubernetes
        */
    }
}