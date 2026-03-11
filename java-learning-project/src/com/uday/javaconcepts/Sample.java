package com.uday.javaconcepts;

import java.sql.Time;

public class Sample {

    public static void main(String[] args) {
        try {
            int a = 4444;
            int b = 0;
            int[] marks = {11, 22, 33, 44};
            System.out.println(marks[4]);

            double result = a / 0;   // ArithmeticException

            System.out.println("Result: " + result);

            throw new CustomException("Custom exception");

        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getName());
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// Create a package exceptionhandelling, add all possible options examples with detail concept wise explanation and o/p in comments




