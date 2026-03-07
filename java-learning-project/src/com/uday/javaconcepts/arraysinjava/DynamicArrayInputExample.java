package com.uday.javaconcepts.arraysinjava;

import java.util.Scanner;

/*
Example: Taking array input from user.
Common in programs where size is decided at runtime.
*/

public class DynamicArrayInputExample {

    public static void main(String[] args) {

        Scanner inputScannerObject = new Scanner(System.in);

        System.out.println("Enter number of students:");

        int studentCount = inputScannerObject.nextInt();

        int[] studentMarksArray = new int[studentCount];

        for (int index = 0; index < studentCount; index++) {

            System.out.println("Enter marks for student " + (index + 1));

            studentMarksArray[index] = inputScannerObject.nextInt();
        }

        System.out.println("Entered Marks:");

        for (int marks : studentMarksArray) {
            System.out.println(marks);
        }
    }
}