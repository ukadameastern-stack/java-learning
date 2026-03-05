package com.uday.pattern;

public class Damaru {

    /**
     * *     *     *     *     *     *     *     *
     *    *     *     *     *     *     *     *
     *       *     *     *     *     *     *
     *          *     *     *     *     *
     *             *     *     *     *
     *                *     *     *
     *                   *     *
     *                      *
     *                   *     *
     *                *     *     *
     *             *     *     *     *
     *          *     *     *     *     *
     *       *     *     *     *     *     *
     *    *     *     *     *     *     *     *
     * *     *     *     *     *     *     *     *
     */
    public static void main(String[] args) {
        String blankSpace = "   ";
        String symbolStr = "*     ";
        // Check if argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // Upper Part
        for (int i = n; i >= 1; i--) {

            // Print leading spaces
            for (int space = 0; space < (n - i); space++) {
                System.out.print(blankSpace);
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print(symbolStr);
            }

            System.out.println();
        }

        // Lower Part
        for (int i = 2; i <= n; i++) {

            // Print leading spaces
            for (int space = 0; space < (n - i); space++) {
                System.out.print(blankSpace);
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print(symbolStr);
            }

            System.out.println();
        }
    }
}
