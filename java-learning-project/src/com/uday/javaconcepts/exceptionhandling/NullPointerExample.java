package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
NULL POINTER EXCEPTION
=========================================================

Occurs when a program tries to use
an object reference that is null.

Example:
Calling a method on null object.
*/

public class NullPointerExample {

    public static void main(String[] args) {

        String name = null;

        try {

            System.out.println(name.length());

        } catch (NullPointerException e) {

            System.out.println(e.getClass().getName()); // java.lang.NullPointerException
            System.out.println(e.getMessage()); // Cannot invoke "String.length()" because "name" is null
            System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@15aeb7ab
            System.out.println("NullPointerException occurred"); // NullPointerException occurred
        }
    }
}

/*
OUTPUT
--------------------------------
java.lang.NullPointerException
Cannot invoke "String.length()" because "name" is null
[Ljava.lang.StackTraceElement;@15aeb7ab
NullPointerException occurred
*/