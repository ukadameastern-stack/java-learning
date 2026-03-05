package com.uday.javatopics;

public class ControlFlowExamples {

    public static void main(String[] args) {

        // -------------------------
        // 1. IF Statement
        // -------------------------
        int num = 10;

        if (num > 0) {
            System.out.println("Number is positive");
        }
        // Output: Number is positive


        // -------------------------
        // 2. IF-ELSE Statement
        // -------------------------
        int age = 16;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        // Output: Not eligible to vote


        // -------------------------
        // 3. IF-ELSE-IF Ladder
        // -------------------------
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
        // Output: Grade B


        // -------------------------
        // 4. SWITCH Statement
        // -------------------------
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        // Output: Wednesday


        // -------------------------
        // 5. FOR Loop
        // -------------------------
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop: " + i);
        }
        /*
        Output:
        For Loop: 1
        For Loop: 2
        For Loop: 3
        */


        // -------------------------
        // 6. WHILE Loop
        // -------------------------
        int i = 1;

        while (i <= 3) {
            System.out.println("While Loop: " + i);
            i++;
        }
        /*
        Output:
        While Loop: 1
        While Loop: 2
        While Loop: 3
        */


        // -------------------------
        // 7. DO-WHILE Loop
        // -------------------------
        int j = 1;

        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while (j <= 3);

        /*
        Output:
        Do-While Loop: 1
        Do-While Loop: 2
        Do-While Loop: 3
        */


        // -------------------------
        // 8. BREAK Statement
        // -------------------------
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println("Break Example: " + k);
        }
        /*
        Output:
        Break Example: 1
        Break Example: 2
        */


        // -------------------------
        // 9. CONTINUE Statement
        // -------------------------
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                continue;
            }
            System.out.println("Continue Example: " + m);
        }
        /*
        Output:
        Continue Example: 1
        Continue Example: 2
        Continue Example: 4
        Continue Example: 5
        */

    }
}