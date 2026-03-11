package com.uday.javaconcepts.exceptionhandling;

import java.io.FileReader;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("data.txt")) {

            System.out.println("File opened");

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("File closed automatically");

        /*
        What Java Actually Converts It Into Internally

        The compiler roughly translates it to something like:

            FileReader fr = new FileReader("data.txt");
            try {
                System.out.println("File opened");
            } finally {
                fr.close();
            }

        So Try-With-Resources is basically an automatic finally block.
         */
    }
}

/*
Explanation:
FileReader implements AutoCloseable.

When the try block finishes execution,
Java automatically calls:

fr.close();

So we do NOT need a finally block.

Possible Output:
File opened
File closed automatically
*/