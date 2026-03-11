package com.uday.javaconcepts.functionalinterfaces;

import java.util.function.Function;

/*
=========================================================
FUNCTION<T, R>
=========================================================

Definition
-----------
Represents a function that accepts one argument
and produces a result.

Method
------
R apply(T t)

T = input
R = return value

Real-world use

Example: convert data

    User → UserDTO
    String → Integer
    Temperature → Fahrenheit
*/

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> square =
                (num) -> num * num;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}

/*
OUTPUT
-------------------------
25
100
*/