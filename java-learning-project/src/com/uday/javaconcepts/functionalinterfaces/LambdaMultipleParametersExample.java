package com.uday.javaconcepts.functionalinterfaces;

/*
=========================================================
LAMBDA WITH MULTIPLE PARAMETERS
=========================================================

When multiple parameters exist,
they are written inside parentheses.

Example syntax:

(a, b) -> a + b
*/

@FunctionalInterface
interface Addition {

    int add(int a, int b);
}

@FunctionalInterface
interface Substraction {

    int sub(int a, int b);
}

public class LambdaMultipleParametersExample {

    public static void main(String[] args) {

        Addition sum = (a, b) -> a + b;

        System.out.println("Sum: " + sum.add(10, 20));

        Substraction sub = (a, b) ->  a - b;

        System.out.print("Sub: " + sub.sub(50, 20));
    }
}

/*
OUTPUT
--------------------------------
Sum: 30
Sub: 30
*/