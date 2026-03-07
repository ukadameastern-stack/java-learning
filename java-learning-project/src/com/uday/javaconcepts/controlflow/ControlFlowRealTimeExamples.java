package com.uday.javaconcepts.controlflow;

public class ControlFlowRealTimeExamples {

    public static void main(String[] args) {

        // ------------------------------------------------
        // 1. IF Statement (Check server status)
        // ------------------------------------------------
        boolean isServerRunning = true;

        if (isServerRunning) {
            System.out.println("Server is running");
        }
        // Output: Server is running


        // ------------------------------------------------
        // 2. IF-ELSE Statement (Login validation)
        // ------------------------------------------------
        boolean isPasswordValid = false;

        if (isPasswordValid) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid password");
        }
        // Output: Invalid password


        // ------------------------------------------------
        // 3. IF-ELSE-IF Ladder (Employee bonus)
        // ------------------------------------------------
        int employeePerformanceScore = 82;

        if (employeePerformanceScore >= 90) {
            System.out.println("Bonus: 20%");
        } else if (employeePerformanceScore >= 75) {
            System.out.println("Bonus: 10%");
        } else if (employeePerformanceScore >= 60) {
            System.out.println("Bonus: 5%");
        } else {
            System.out.println("No bonus");
        }
        // Output: Bonus: 10%


        // ------------------------------------------------
        // 4. SWITCH Statement (API request method)
        // ------------------------------------------------
        String httpRequestMethod = "GET";

        switch (httpRequestMethod) {
            case "GET":
                System.out.println("Fetching data from server");
                break;
            case "POST":
                System.out.println("Creating new record");
                break;
            case "PUT":
                System.out.println("Updating existing record");
                break;
            case "DELETE":
                System.out.println("Deleting record");
                break;
            default:
                System.out.println("Invalid request method");
        }
        // Output: Fetching data from server


        // ------------------------------------------------
        // 5. FOR Loop (Process list of user IDs)
        // ------------------------------------------------
        for (int currentUserId = 1; currentUserId <= 3; currentUserId++) {
            System.out.println("Processing user ID: " + currentUserId);
        }

        /*
        Output:
        Processing user ID: 1
        Processing user ID: 2
        Processing user ID: 3
        */


        // ------------------------------------------------
        // 6. WHILE Loop (Retry API request)
        // ------------------------------------------------
        int retryAttemptCounter = 1;

        while (retryAttemptCounter <= 3) {
            System.out.println("Retry attempt number: " + retryAttemptCounter);
            retryAttemptCounter++;
        }

        /*
        Output:
        Retry attempt number: 1
        Retry attempt number: 2
        Retry attempt number: 3
        */


        // ------------------------------------------------
        // 7. DO-WHILE Loop (Menu execution)
        // ------------------------------------------------
        int menuExecutionCount = 1;

        do {
            System.out.println("Executing menu option: " + menuExecutionCount);
            menuExecutionCount++;
        } while (menuExecutionCount <= 2);

        /*
        Output:
        Executing menu option: 1
        Executing menu option: 2
        */


        // ------------------------------------------------
        // 8. BREAK Statement (Stop search when found)
        // ------------------------------------------------
        int targetOrderId = 3;

        for (int currentOrderId = 1; currentOrderId <= 5; currentOrderId++) {

            if (currentOrderId == targetOrderId) {
                System.out.println("Order found: " + currentOrderId);
                break;
            }

            System.out.println("Checking order: " + currentOrderId);
        }

        /*
        Output:
        Checking order: 1
        Checking order: 2
        Order found: 3
        */


        // ------------------------------------------------
        // 9. CONTINUE Statement (Skip inactive users)
        // ------------------------------------------------
        for (int currentUserIndex = 1; currentUserIndex <= 5; currentUserIndex++) {

            if (currentUserIndex == 3) {
                continue;
            }

            System.out.println("Sending notification to user: " + currentUserIndex);
        }

        /*
        Output:
        Sending notification to user: 1
        Sending notification to user: 2
        Sending notification to user: 4
        Sending notification to user: 5
        */

    }
}