
package com.uday.javaconcepts.branching;

public class BranchingStatementsExample {

    public static void main(String[] args) {

        int targetOrderIdentifier = 103;

        for (int currentOrderIdentifier = 100; currentOrderIdentifier <= 105; currentOrderIdentifier++) {

            if (currentOrderIdentifier == targetOrderIdentifier) {
                System.out.println("Order Found: " + currentOrderIdentifier);
                break;
            }

            System.out.println("Checking Order: " + currentOrderIdentifier);
        }

        /*
        Output:
        Checking Order: 100
        Checking Order: 101
        Checking Order: 102
        Order Found: 103
        */
    }
}
