package com.uday.javaconcepts.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

/*
=========================================================
BUILT-IN FUNCTIONAL INTERFACES
=========================================================

Java provides ready-to-use functional interfaces.

Common ones:

Predicate<T>   -> returns boolean
Function<T,R>  -> takes input, returns output
Consumer<T>    -> takes input, no return
Supplier<T>    -> returns value, no input
*/

public class BuiltInFunctionalInterfaceExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven =
                (num) -> num % 2 == 0;

        System.out.println("Is even: " + isEven.test(10));
        System.out.println("Is even: " + isEven.test(7));

        Function<String, Integer> parseInteger = String::length;
        System.out.println("Parse integer: " + parseInteger.apply("Hello"));


    }
}

/*
OUTPUT
--------------------------------
true
false
*/