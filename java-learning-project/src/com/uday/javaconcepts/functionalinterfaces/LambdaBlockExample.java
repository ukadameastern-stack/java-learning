package com.uday.javaconcepts.functionalinterfaces;

/*
=========================================================
LAMBDA BLOCK BODY
=========================================================

If multiple statements exist,
use curly braces.

Syntax:

(parameters) -> {
    statements
    return value;
}
*/

import java.lang.reflect.Modifier;

@FunctionalInterface
interface Multiplication {

    int multiply(int a, int b);
}

@FunctionalInterface
interface Division {

    int div(int a, int b);
}

public class LambdaBlockExample {

    public static void main(String[] args) {

        Multiplication m = (a, b) -> {
            int result = a * b;
            return result;
        };

        System.out.println("Multiplication: " + m.multiply(5, 6));

        Division d = (int a, int b) -> {
            int r = a / b;
            return r;
            // return "XYZ"; // Bad return type in lambda expression: String cannot be converted to int
        };
        System.out.println("Division: " + d.div(37, 6));
    }
}

/*
OUTPUT
--------------------------------
Multiplication: 30
Division: 6
*/