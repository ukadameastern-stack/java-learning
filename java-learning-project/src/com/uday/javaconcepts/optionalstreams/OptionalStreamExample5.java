package com.uday.javaconcepts.optionalstreams;

import java.util.Arrays;
import java.util.List;

public class OptionalStreamExample5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");

        String result =
                list.stream()
                        .filter(s -> s.equals("Z"))
                        .findFirst()
                        .orElse("Not Found");

        System.out.println(result);

        String result2 =
                list.stream()
                        .filter(s -> s.equals("B"))
                        .findFirst()
                        .orElse("Not Found");
        System.out.println(result2);
    }
}

/*
OUTPUT:
Not Found
*/