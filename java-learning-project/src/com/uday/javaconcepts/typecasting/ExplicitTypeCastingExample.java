package com.uday.javaconcepts.typecasting;

/*
=========================================================
EXPLICIT TYPE CASTING (NARROWING CASTING) IN JAVA
=========================================================

Definition
-----------
Explicit Type Casting happens when a larger data type
is converted into a smaller data type.

This conversion must be done manually by the programmer.

It is also called:
1) Narrowing Casting
2) Manual Type Conversion

---------------------------------------------------------
ORDER OF NARROWING
---------------------------------------------------------

double → float → long → int → short → byte

---------------------------------------------------------
Why Manual Casting Required?
---------------------------------------------------------

Because there may be DATA LOSS.

Example:
double = 10.75

When converted to int

int = 10

Decimal part is removed.

---------------------------------------------------------
Syntax
---------------------------------------------------------

datatype variable = (datatype) value;

---------------------------------------------------------
Example
---------------------------------------------------------
double -> int

*/

public class ExplicitTypeCastingExample {

    public static void main(String[] args) {

        double price = 99.99;

        // Manual conversion
        int newPrice = (int) price;

        System.out.println("Original double value: " + price);
        System.out.println("Converted int value: " + newPrice);
    }
}

/*
OUTPUT
--------------------------------
Original double value: 99.99
Converted int value: 99
*/