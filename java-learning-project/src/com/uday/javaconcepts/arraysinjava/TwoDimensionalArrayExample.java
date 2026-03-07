package com.uday.javaconcepts.arraysinjava;

/*
Example: Two Dimensional Array
Used for table or matrix data.

Example:
Student marks in 3 subjects.
*/

public class TwoDimensionalArrayExample {

    public static void main(String[] args) {

        int[][] studentMarksMatrix = {
                {85, 90, 88},
                {78, 82, 80},
                {92, 89, 95}
        };

        System.out.println("First student Math marks: " + studentMarksMatrix[0][0]);
        System.out.println("Third student Science marks: " + studentMarksMatrix[2][2]);
    }
}

/*
Output

First student Math marks: 85
Third student Science marks: 95
*/