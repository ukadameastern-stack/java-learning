package com.uday.javaconcepts.exceptionhandling;

/*
=========================================================
TRY CATCH FINALLY BLOCK
=========================================================

try
---
Code that may cause exception.

catch
-----
Handles exception.

finally
-------
Always executes whether exception occurs or not.


In Java, the finally block is used to execute cleanup code that must run no matter what happens — whether an exception occurs or not.

Definition

    The finally block always executes after the try and catch blocks.

Even if:

    an exception occurs

    the exception is handled

    the method returns

the finally block still runs (except in very rare cases like System.exit()).

Real-Time Uses of finally Block

    In real-world applications, finally is mainly used for resource cleanup.

Typical resources:

    Files

    Database connections

    Network sockets

    Streams

    Locks

These resources must be closed properly,
otherwise they cause memory leaks or connection leaks.

------------------------------------------------------
Important Interview Point
------------------------------------------------------
Why finally is important?

    Because resource cleanup must happen even if an exception occurs.

Without finally, resources may stay open and cause:

    Memory leaks

    File locks

    DB connection exhaustion

    Deadlocks
*/

import java.io.FileReader;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Exception caught");

        } finally {

            System.out.println("Finally block always executes");
        }

        FileReader fr = null;

        try {
            fr = new FileReader("data.txt");
            System.out.println("File opened");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (fr != null)
                    fr.close();
                System.out.println("File closed");
            } catch (Exception e) {
            }
        }
    }
}

/*
OUTPUT
--------------------------------
Exception caught
Finally block always executes
Exception occurred: data.txt (No such file or directory)
File closed
*/