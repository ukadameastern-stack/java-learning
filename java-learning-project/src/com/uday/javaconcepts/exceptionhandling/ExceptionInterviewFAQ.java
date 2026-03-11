package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
INTERVIEW FAQ's
=========================================================

Q1: Can we have multiple catch blocks?
Yes.

Q2: Can try exist without catch?
Yes, with finally.

Q3: Can finally run without exception?
Yes.

Q4: Can we catch multiple exceptions together?
Yes (Java 7 feature).

Example below.
*/

public class ExceptionInterviewFAQ {

    public static void main(String[] args) {

        try {

            int arr[] = new int[2];
            System.out.println(arr[5]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Multiple exception handled: " + e);
        }
    }
}

/*
OUTPUT
--------------------------------
Multiple exception handled: java.lang.ArrayIndexOutOfBoundsException
*/