package com.uday.javaconcepts.arraysinjava;

/*
Example: Iterating over array using for loop.
Real world example: Processing employee IDs.
*/

public class ArrayIterationExample {

    public static void main(String[] args) {

        int[] employeeIdArray = {101, 102, 103, 104};

        for (int index = 0; index < employeeIdArray.length; index++) {

            System.out.println("Employee ID: " + employeeIdArray[index]);
        }

        for (int employeeId : employeeIdArray) {
            System.out.println("Employee ID: " + employeeId);
        }

        String[] employeeName = {"Uday", "Vijay", "Vinod"};
        for (int i = 0; i < employeeName.length; i++) {
            System.out.println(employeeName[i]);
        }

        for (String name : employeeName) {
            System.out.println(name);
        }
    }
}

/*
Output

Employee ID: 101
Employee ID: 102
Employee ID: 103
Employee ID: 104
*/