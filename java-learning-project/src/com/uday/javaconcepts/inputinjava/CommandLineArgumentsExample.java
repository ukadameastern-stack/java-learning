package com.uday.javaconcepts.inputinjava;

/*
================================================================================
TOPIC: Command Line Arguments in Java
================================================================================

Definition:
Command Line Arguments are values passed to a Java program when the program
is executed from the command line.

These values are received inside the main() method as a String array.

Syntax of main method:

public static void main(String[] commandLineArguments)

commandLineArguments → Array that stores all values passed while running program.

Example command to run program:

java CommandLineArgumentsExample Rahul 25 Pune

Here:
commandLineArguments[0] = Rahul
commandLineArguments[1] = 25
commandLineArguments[2] = Pune


Important Points:
1. All command line arguments are stored as String values.
2. We must convert them to other types if needed (Integer.parseInt()).
3. Useful in automation scripts, DevOps tools, batch processing, etc.
4. Commonly used for passing configuration values.

================================================================================
All command-line arguments are stored as String values for several important design and technical reasons.

1. The Operating System Passes Arguments as Text

When you run a Java program from the terminal, the operating system sends arguments as text strings.

Example:

java MyProgram 10 true Rahul 95.5

The OS does not know Java data types like int, boolean, or double.
It simply passes everything as text tokens.
================================================================================
*/

public class CommandLineArgumentsExample {

    public static void main(String[] commandLineArguments) {

        /*
        -------------------------------------------------------------------------
        Example 1: Printing all command line arguments
        -------------------------------------------------------------------------
        */

        System.out.println("Total Arguments Passed: " + commandLineArguments.length);

        for (String argumentValue : commandLineArguments) {
            System.out.println("Argument Value: " + argumentValue);
        }

        /*
        Example Run Command:

        java CommandLineArgumentsExample Apple Banana Mango


        Output:

        Total Arguments Passed: 3
        Argument Value: Apple
        Argument Value: Banana
        Argument Value: Mango
        */


        /*
        -------------------------------------------------------------------------
        Example 2: Accessing specific argument values
        -------------------------------------------------------------------------
        */

        if (commandLineArguments.length >= 2) {

            String employeeName = commandLineArguments[0];
            String employeeDepartment = commandLineArguments[1];

            System.out.println("Employee Name: " + employeeName);
            System.out.println("Employee Department: " + employeeDepartment);

        }

        /*
        Example Run Command:

        java CommandLineArgumentsExample John IT


        Output:

        Employee Name: John
        Employee Department: IT
        */


        /*
        -------------------------------------------------------------------------
        Example 3: Converting argument from String to Integer
        -------------------------------------------------------------------------
        */

        if (commandLineArguments.length >= 1) {

            int productQuantity = Integer.parseInt(commandLineArguments[0]);

            System.out.println("Product Quantity: " + productQuantity);
        }

        /*
        Example Run Command:

        java CommandLineArgumentsExample 10


        Output:

        Product Quantity: 10
        */


        /*
        -------------------------------------------------------------------------
        Example 4: Real Time Example (Calculator)
        -------------------------------------------------------------------------
        */

        if (commandLineArguments.length >= 2) {

            int firstNumber = Integer.parseInt(commandLineArguments[0]);
            int secondNumber = Integer.parseInt(commandLineArguments[1]);

            int sumResult = firstNumber + secondNumber;

            System.out.println("Sum Result: " + sumResult);
        }

        /*
        Example Run Command:

        java CommandLineArgumentsExample 10 20


        Output:

        Sum Result: 30
        */

    }
}
