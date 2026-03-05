
package com.uday.javaconcepts.operators;

public class OperatorsExample {

    public static void main(String[] args) {

        int firstNumberValue = 10;
        int secondNumberValue = 5;

        // Arithmetic Operator
        int additionResult = firstNumberValue + secondNumberValue;
        System.out.println("Addition Result: " + additionResult); // 15

        // Relational Operator
        boolean isFirstGreater = firstNumberValue > secondNumberValue;
        System.out.println("Is First Greater: " + isFirstGreater); // true

        // Logical Operator
        boolean logicalCheck = firstNumberValue > 0 && secondNumberValue > 0;
        System.out.println("Both numbers positive: " + logicalCheck); // true

        // Unary Operator
        ++firstNumberValue;
        System.out.println("After Pre Increment: " + firstNumberValue); // 11
    }
}
