package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
EXCEPTION vs ERROR
=========================================================

Exception
---------
Recoverable problem
Handled using try-catch

Example:
IOException
SQLException

Error
-----
Serious system problem
Application should not try to handle it

Example:
OutOfMemoryError
StackOverflowError
*/

public class ExceptionVsErrorExample {

    public static void main(String[] args) {

        try {

            int arr[] = new int[2];

            System.out.println(arr[5]);

        } catch (Exception e) {

            System.out.println("Exception caught: " + e);
        }
    }
}

/*
OUTPUT
--------------------------------
Exception caught: java.lang.ArrayIndexOutOfBoundsException
*/