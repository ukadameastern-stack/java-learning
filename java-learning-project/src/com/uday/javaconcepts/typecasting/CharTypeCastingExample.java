package com.uday.javaconcepts.typecasting;

/*
=========================================================
CHAR TYPE CASTING IN JAVA
=========================================================

Characters internally store ASCII / Unicode values.

Example:

'A' → 65
'B' → 66
'a' → 97

When we cast char to int,
Java returns the ASCII value.

*/

public class CharTypeCastingExample {

    public static void main(String[] args) {

        char letter = 'A';

        // int asciiValue = (int) letter; // Casting 'letter' to 'int' is redundant
        int asciiValue = letter;
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + asciiValue);
    }
}

/*
OUTPUT
--------------------------------
Character: A
ASCII value: 65
*/