package com.uday.javaconcepts;

public class BranchingStatementsExamples {

    /**
     * Branching statements in Java include:
     * break
     * continue
     * return
     */
    public static void main(String[] args) {

        // ------------------------------------------------
        // 1. break Statement (Stop searching when order found)
        // ------------------------------------------------
        int targetOrderIdentifier = 104;

        for (int currentOrderIdentifier = 100; currentOrderIdentifier <= 110; currentOrderIdentifier++) {

            if (currentOrderIdentifier == targetOrderIdentifier) {
                System.out.println("Order found: " + currentOrderIdentifier);
                break;
            }

            System.out.println("Checking order: " + currentOrderIdentifier);
        }

        /*
        Output:
        Checking order: 100
        Checking order: 101
        Checking order: 102
        Checking order: 103
        Order found: 104
        */


        // ------------------------------------------------
        // 2. continue Statement (Skip inactive users)
        // ------------------------------------------------
        for (int currentUserIdentifier = 1; currentUserIdentifier <= 5; currentUserIdentifier++) {

            if (currentUserIdentifier == 3) {
                continue;
            }

            System.out.println("Sending notification to user: " + currentUserIdentifier);
        }

        /*
        Output:
        Sending notification to user: 1
        Sending notification to user: 2
        Sending notification to user: 4
        Sending notification to user: 5
        */


        // ------------------------------------------------
        // 3. return Statement (Stop method when login fails)
        // ------------------------------------------------
        validateUserLogin("admin", "wrongPassword");

        /*
        Output:
        Invalid credentials. Access denied.
        */

    }

    public static void validateUserLogin(String enteredUsername, String enteredPassword) {

        String correctUsername = "admin";
        String correctPassword = "admin123";

        if (!enteredUsername.equals(correctUsername) || !enteredPassword.equals(correctPassword)) {
            System.out.println("Invalid credentials. Access denied.");
            return;
        }

        System.out.println("Login successful");
    }
}