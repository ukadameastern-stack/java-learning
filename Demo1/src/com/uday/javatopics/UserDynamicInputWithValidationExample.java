package com.uday.javatopics;

import java.util.Scanner;

public class UserDynamicInputWithValidationExample {

    public static void main(String[] arguments) {

        Scanner userInputScanner = new Scanner(System.in);

        // Example 1: String Input
        System.out.println("Enter your full name:");
        String userFullName = userInputScanner.nextLine();

        System.out.println("Hello " + userFullName);

        /*
        Sample Output:
        Enter your full name:
        Uday Kadam
        Hello Uday Kadam
        */


        // Example 2: Integer Input with Validation
        System.out.println("Enter your age:");

        int userAge = 0;

        if (userInputScanner.hasNextInt()) {
            userAge = userInputScanner.nextInt();

            if (userAge > 0 && userAge < 120) {
                System.out.println("Valid age entered: " + userAge);
            } else {
                System.out.println("Age out of valid range");
            }
        } else {
            System.out.println("Invalid input. Age must be a number.");
        }

        /*
        Sample Output:
        Enter your age:
        28
        Valid age entered: 28
        */


        // Example 3: Double Input
        System.out.println("Enter product price:");

        if (userInputScanner.hasNextDouble()) {
            double productPriceValue = userInputScanner.nextDouble();
            System.out.println("Product price entered: " + productPriceValue);
        } else {
            System.out.println("Invalid input. Price should be number");
        }


        /*
        Sample Output:
        Enter product price:
        499.99
        Product price entered: 499.99
        */


        // Example 4: Real-Time Example (Login Validation)
        userInputScanner.nextLine(); // consume leftover newline

        System.out.println("Enter username:");
        String enteredUsernameValue = userInputScanner.nextLine();

        System.out.println("Enter password:");
        String enteredPasswordValue = userInputScanner.nextLine();

        String storedUsernameValue = "admin";
        String storedPasswordValue = "admin123";

        if (enteredUsernameValue.equals(storedUsernameValue) &&
                enteredPasswordValue.equals(storedPasswordValue)) {

            System.out.println("Login successful");

        } else {
            System.out.println("Invalid username or password");
        }

        /*
        Sample Output:
        Enter username:
        admin
        Enter password:
        admin123
        Login successful
        */


        userInputScanner.close();
    }
}