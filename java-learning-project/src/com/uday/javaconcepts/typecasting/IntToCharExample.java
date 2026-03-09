package com.uday.javaconcepts.typecasting;

/*
=========================================================
INT TO CHAR CASTING
=========================================================

We can convert an integer ASCII value into a character.

Example:
65 → 'A'
66 → 'B'

*/

public class IntToCharExample {

    public static void main(String[] args) {

        int ascii = 66;

        char character = (char) ascii;

        System.out.println("ASCII Value: " + ascii);
        System.out.println("Converted Character: " + character);
    }
}

/*
OUTPUT
--------------------------------
ASCII Value: 66
Converted Character: B
*/