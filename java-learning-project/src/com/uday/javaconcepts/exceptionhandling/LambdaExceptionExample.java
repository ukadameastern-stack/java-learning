package com.uday.javaconcepts.exceptionhandling;

import java.util.function.Consumer;

/*
=========================================================
LAMBDA EXPRESSION WITH EXCEPTION HANDLING
=========================================================

Lambda expressions can throw exceptions just like
normal methods.

However, checked exceptions must still be handled.

Example:
A lambda printing numbers but handling divide-by-zero.
*/

public class LambdaExceptionExample {

    public static void main(String[] args) {

        Consumer<Integer> printer = num -> {
            try {
                int result = 10 / num;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        };

        printer.accept(2);
        printer.accept(0);
    }
}

/*
OUTPUT
--------------------------------
5
Cannot divide by zero
*/