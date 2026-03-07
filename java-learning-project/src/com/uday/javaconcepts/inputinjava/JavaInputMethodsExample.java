package com.uday.javaconcepts.inputinjava;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;

public class JavaInputMethodsExample {

    public static void main(String[] args) throws IOException {

        // =====================================================
        // 1. Scanner Class Example
        // =====================================================
        /*
         Scanner
         Package: java.util

         Important Details:
         - Most commonly used class for user input.
         - Can read different data types directly (int, double, String, boolean).
         - Internally uses regex for parsing input.
         - Slower compared to BufferedReader.
         - Best for small applications and beginners.
        */

        Scanner scannerInputObject = new Scanner(System.in);

        System.out.print("Enter your age using Scanner: ");
        int userAgeValue = scannerInputObject.nextInt();

        System.out.println("Age entered using Scanner: " + userAgeValue);

        /*
        Example Input:
        25

        Output:
        Age entered using Scanner: 25
        */


        // =====================================================
        // 2. BufferedReader Example
        // =====================================================
        /*
         BufferedReader
         Package: java.io

         Important Details:
         - Faster than Scanner.
         - Uses buffering mechanism for efficient input reading.
         - Commonly used in high-performance applications.
         - Always reads input as String.
         - Needs manual type conversion (Integer.parseInt, etc).
        */

        BufferedReader bufferedReaderObject =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name using BufferedReader: ");
        String userNameValue = bufferedReaderObject.readLine();

        System.out.println("Name entered using BufferedReader: " + userNameValue);

        /*
        Example Input:
        Uday

        Output:
        Name entered using BufferedReader: Uday
        */


        // =====================================================
        // 3. Console Example
        // =====================================================
        /*
         Console
         Package: java.io

         Important Details:
         - Used for secure input (passwords).
         - Password characters are not visible when typing.
         - Mainly used in command-line applications.
         - Does NOT work inside most IDEs (VS Code, IntelliJ, Eclipse).
         - Works only when program runs in terminal.
        */

        Console consoleObject = System.console();

        if (consoleObject != null) {

            String consoleUserNameValue = consoleObject.readLine("Enter username using Console: ");
            char[] passwordValue = consoleObject.readPassword("Enter password using Console: ");

            System.out.println("Username entered using Console: " + consoleUserNameValue);

            /*
            Example Input:
            Username: admin
            Password: ****

            Output:
            Username entered using Console: admin
            */

        } else {

            System.out.println("Console is not available in this IDE environment.");
        }


        // =====================================================
        // 4. DataInputStream Example
        // =====================================================
        /*
         DataInputStream
         Package: java.io

         Important Details:
         - Older method for taking input.
         - readLine() method is deprecated.
         - Rarely used in modern Java programs.
         - Mostly used in legacy systems.
        */

        DataInputStream dataInputStreamObject =
                new DataInputStream(System.in);

        System.out.print("Enter any value using DataInputStream: ");
        String dataInputValue = dataInputStreamObject.readLine();

        System.out.println("Value entered using DataInputStream: " + dataInputValue);

        /*
        Example Input:
        Hello

        Output:
        Value entered using DataInputStream: Hello
        */

        scannerInputObject.close();
    }
}