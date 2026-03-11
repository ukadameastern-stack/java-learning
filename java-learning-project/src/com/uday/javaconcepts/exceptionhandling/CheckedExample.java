package com.uday.javaconcepts.exceptionhandling;

import java.io.FileReader;

/*
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

------------------------------------------------------------------------
| Feature              | Checked Exception  | Unchecked Exception      |
| -------------------- | ------------------ | ------------------------ |
| Checked at           | Compile Time       | Runtime                  |
| Handling Required    | Yes                | No                       |
| Compiler Enforcement | Mandatory          | Not mandatory            |
| Cause                | External resources | Programming logic errors |
| Parent Class         | Exception          | RuntimeException         |
------------------------------------------------------------------------
 */
public class CheckedExample {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");
        }
        catch(Exception e) {
            System.out.println(e.getClass().getName()); // java.io.FileNotFoundException
            System.out.println(e.getMessage()); // test.txt (No such file or directory)
            System.out.println("File not found"); // File not found
        }
    }
}

/*
Explanation:
FileReader may throw FileNotFoundException.

Since it is a Checked Exception,
Java forces us to handle it using try-catch.

Output:
java.io.FileNotFoundException
test.txt (No such file or directory)
File not found (if file does not exist)
*/