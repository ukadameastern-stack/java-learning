package com.uday.javaconcepts.typecasting;

/*
=========================================================
IMPLICIT TYPE CASTING (WIDENING CASTING) IN JAVA
=========================================================

Definition
-----------
Implicit Type Casting happens automatically when a smaller
data type is converted into a larger data type.

It is also called:
1) Widening Casting
2) Automatic Type Conversion

Java performs this conversion automatically because
there is NO risk of data loss.

---------------------------------------------------------
ORDER OF WIDENING
---------------------------------------------------------

byte → short → int → long → float → double

---------------------------------------------------------
Example
---------------------------------------------------------
byte -> int
int -> double

---------------------------------------------------------
Real World Example
---------------------------------------------------------
When a small container's value is stored into a bigger
container, it fits easily.

Example:
water bottle → bucket

---------------------------------------------------------
Key Points
---------------------------------------------------------
1. Done automatically by JVM
2. No data loss
3. Smaller → Larger datatype

*/

public class ImplicitTypeCastingExample {

    public static void main(String[] args) {

        int num = 100;

        // int automatically converted to double
        double result = num;

        System.out.println("Integer value: " + num);
        System.out.println("Converted double value: " + result);
    }
}

/*
OUTPUT
--------------------------------
Integer value: 100
Converted double value: 100.0
*/