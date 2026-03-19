package com.uday.javaconcepts.streamapi.info;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> values = List.of("One", "Two", "Three");
        Stream<String> stream1 = values.stream();
        System.out.println(stream1.count()); // 3

        // Arrays of Values
        String[] names = {"Vijay", "Uday", "Amol"};
        Stream<String> stream2 = Arrays.stream(names);

        // Stream Methods
        Stream<String> stream3 = Stream.of(names);

        // Generate()
        Stream<String> stream4 = Stream.generate(() -> "One");

        // builder()
        // Builder Design Pattern
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream5 = builder.add("One").add("Two").add("Three").build();

        // Empty stream
        Stream<String> stream6 = Stream.empty();


    }
}
