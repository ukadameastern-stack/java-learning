package com.uday.javaconcepts.typecasting;

/*
=========================================================
DATA LOSS IN TYPE CASTING
=========================================================

When converting from a larger datatype to a smaller
datatype, some data may be lost.

Example:
double → int

Decimal values are removed.

Example:
15.78 → 15

---------------------------------------------------------
Important Interview Concept
---------------------------------------------------------

Explicit casting may cause:

1) Data loss
2) Precision loss
3) Overflow

*/

public class DataLossExample {

    public static void main(String[] args) {

        double number = 15.78;

        int convertedNumber = (int) number;

        System.out.println("Original value: " + number);
        System.out.println("After casting to int: " + convertedNumber);
    }
}

/*
OUTPUT
--------------------------------
Original value: 15.78
After casting to int: 15
*/