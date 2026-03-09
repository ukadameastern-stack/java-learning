package com.uday.javaconcepts.encapsulation;

/*
=====================================================
ENCAPSULATION EXAMPLE
=====================================================

Steps:
1) Create object
2) Set values using setter methods
3) Get values using getter methods

Direct access to variables is NOT allowed because
variables are PRIVATE.

Example:
student.name = "Uday";  ❌ Not allowed

Correct way:
student.setName("Uday"); ✔

=====================================================
*/

public class EncapsulationExample {

    public static void main(String[] args) {

        Student student = new Student();

        // Setting values using setters
        student.setName("Uday");
        student.setAge(25);
        student.setMarks(88.5);

        // Getting values using getters
        System.out.println("Student Name : " + student.getName());
        System.out.println("Student Age : " + student.getAge());
        System.out.println("Student Marks : " + student.getMarks());

    }
}

/*
========================
OUTPUT
========================

Student Name : Uday
Student Age : 25
Student Marks : 88.5

*/
