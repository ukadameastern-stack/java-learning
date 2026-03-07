package com.uday.javaconcepts.arraysinjava;

/*
Example: One Dimensional Array
Used when storing a list of similar data.
Example: Monthly sales values.
*/

public class OneDimensionalArrayExample {

    public static void main(String[] args) {

        int[] monthlySalesArray = {1200, 1500, 1800, 2000, 1700};

        System.out.println("First month sales: " + monthlySalesArray[0]);
        System.out.println("Third month sales: " + monthlySalesArray[2]);

        // It will compile, but it will give Exception when we run the program
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 5
        System.out.println("Third month sales: " + monthlySalesArray[20]);
    }
}

/*
Output

First month sales: 1200
Third month sales: 1800
*/