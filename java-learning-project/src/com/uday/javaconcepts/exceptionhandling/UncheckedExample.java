package com.uday.javaconcepts.exceptionhandling;

/*
Unchecked Exceptions
Definition

An Unchecked Exception is an exception that is not checked at compile time.

These exceptions occur during runtime,
and the compiler does not force the programmer to handle them.

They usually happen because of programming mistakes.

Key Characteristics:

    Checked during runtime

    Not mandatory to handle

    Usually caused by logical errors

Common Unchecked Exceptions:

    NullPointerException

    ArithmeticException

    ArrayIndexOutOfBoundsException

    NumberFormatException

    IllegalArgumentException


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
public class UncheckedExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println(result);
    }
}

/*
Explanation:
Dividing a number by zero causes ArithmeticException.

Since ArithmeticException is an Unchecked Exception,
the compiler does NOT force us to handle it.

Output:
Exception in thread "main"
java.lang.ArithmeticException: / by zero
*/