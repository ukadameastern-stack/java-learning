package com.uday.javatopics;

import java.util.Scanner;

public class UserDynamicInputExamples {

    /**
     * Concepts Covered:
     *
     * Scanner class
     * nextLine() → for String input
     * nextInt() → for integer input
     * nextDouble() → for decimal input
     * Dynamic input processing
     * Real-world examples (login, billing, grading, temperature conversion)
     */
    public static void main(String[] args) {

        Scanner userInputScanner = new Scanner(System.in);

        // ------------------------------------------------
        // 1. User Login Input Example
        // ------------------------------------------------
        System.out.print("Enter username: ");
        String enteredUsername = userInputScanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = userInputScanner.nextLine();

        System.out.println("Login attempt for user: " + enteredUsername);

        /*
        Example Input:
        Enter username: admin
        Enter password: admin123

        Output:
        Login attempt for user: admin
        */


        // ------------------------------------------------
        // 2. Product Price Calculation Example
        // ------------------------------------------------
        System.out.print("\nEnter product price: ");
        // Exception in thread "main" java.util.InputMismatchException when we enter : abcd
        double enteredProductPrice = userInputScanner.nextDouble();

        System.out.print("Enter product quantity: ");
        int enteredProductQuantity = userInputScanner.nextInt();

        double calculatedTotalPrice = enteredProductPrice * enteredProductQuantity;

        System.out.println("Total price: " + calculatedTotalPrice);

        /*
        Example Input:
        Enter product price: 100
        Enter product quantity: 3

        Output:
        Total price: 300.0
        */


        // ------------------------------------------------
        // 3. Student Grade Evaluation Example
        // ------------------------------------------------
        System.out.print("\nEnter student marks: ");
        int enteredStudentMarks = userInputScanner.nextInt();

        if (enteredStudentMarks >= 90) {
            System.out.println("Grade: A");
        } else if (enteredStudentMarks >= 75) {
            System.out.println("Grade: B");
        } else if (enteredStudentMarks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        /*
        Example Input:
        Enter student marks: 82

        Output:
        Grade: B
        */


        // ------------------------------------------------
        // 4. Temperature Conversion Example
        // ------------------------------------------------
        System.out.print("\nEnter temperature in Celsius: ");
        double enteredTemperatureCelsius = userInputScanner.nextDouble();

        double calculatedTemperatureFahrenheit =
                (enteredTemperatureCelsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + calculatedTemperatureFahrenheit);

        /*
        Example Input:
        Enter temperature in Celsius: 25

        Output:
        Temperature in Fahrenheit: 77.0
        */


        // ------------------------------------------------
        // Close Scanner
        // ------------------------------------------------
        userInputScanner.close();
    }
}