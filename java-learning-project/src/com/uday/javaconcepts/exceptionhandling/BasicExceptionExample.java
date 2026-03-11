package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
EXCEPTION HANDLING IN JAVA
=========================================================

Exception Handling allows a program to continue
execution even after an error occurs.

Main keywords:
try
catch
finally
throw
throws
*/

public class BasicExceptionExample {

    public static void main(String[] args) {

        try {
            div();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void div() throws Exception {
        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println(result);
    }
}

/*
OUTPUT
--------------------------------
Arithmetic Exception occurred
*/