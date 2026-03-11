package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
EXCEPTION CLASS HIERARCHY
=========================================================

                Throwable
                /      \
            Error     Exception
                         |
                RuntimeException

Throwable
---------
Root class of all errors and exceptions.

Exception
---------
Checked exceptions.
Definition:

A Checked Exception is an exception that is checked at compile time by the Java compiler.

This means the compiler forces the programmer to handle the exception using:

    try-catch
    throws

If you do not handle it, the program will not compile.

Key Characteristics

    Checked during compilation

    Must be handled explicitly

    Generally related to external resources

Common Checked Exceptions

    IOException

    SQLException

    ClassNotFoundException

    FileNotFoundException

    InterruptedException

RuntimeException
---------------
Unchecked exceptions.
*/

public class ExceptionHierarchyExample {

    public static void main(String[] args) {

        try {

            String str = null;
            System.out.println(str.length());

        } catch (RuntimeException e) {

            System.out.println("Runtime Exception: " + e);
            e.printStackTrace();
        }
    }
}

/*
OUTPUT
--------------------------------
Runtime Exception: java.lang.NullPointerException
*/