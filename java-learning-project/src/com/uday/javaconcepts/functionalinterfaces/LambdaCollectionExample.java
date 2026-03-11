package com.uday.javaconcepts.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

/*
=========================================================
LAMBDA WITH COLLECTIONS
=========================================================

Lambda expressions are commonly used
with collections.

Example:
forEach() method
*/

public class LambdaCollectionExample {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Java", "Spring", "Docker");

        names.forEach(name -> System.out.println(name));
    }
}

/*
OUTPUT
--------------------------------
Java
Spring
Docker
*/