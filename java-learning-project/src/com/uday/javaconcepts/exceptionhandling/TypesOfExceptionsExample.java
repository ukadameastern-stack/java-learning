package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
TYPES OF EXCEPTIONS
=========================================================

1 Checked Exception
   Checked at compile time
   Example:
   IOException
   SQLException

2 Unchecked Exception
   Occurs at runtime
   Example:
   ArithmeticException
   NullPointerException
*/

public class TypesOfExceptionsExample {

    public static void main(String[] args) {

        try {

            int num = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Unchecked Exception: " + e);
        }
    }
}

/*
OUTPUT
--------------------------------
Unchecked Exception: java.lang.ArithmeticException: / by zero
*/