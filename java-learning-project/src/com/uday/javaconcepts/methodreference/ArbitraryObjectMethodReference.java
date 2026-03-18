package com.uday.javaconcepts.methodreference;

import java.util.*;

public class ArbitraryObjectMethodReference {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("java","spring","docker");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*
        Equivalent Lambda

        x -> x.toUpperCase()

        OUTPUT
        JAVA
        SPRING
        DOCKER
        */

//        list.stream()
//                .map(ConvertToLowerCase::convertToLowerCase) // Use InstanceMethodReference
//                .forEach(System.out::println);
        // JAVA WORLD!

        ConvertToUpperCase upperCase1 = str -> str.toUpperCase();
        System.out.println(upperCase1.convertToUpperCase("Java World!"));
        // JAVA WORLD!

        ConvertToUpperCase upperCase = String::toUpperCase;
        System.out.println(upperCase.convertToUpperCase("Java method reference"));
        // JAVA METHOD REFERENCE
    }

}
