package com.uday.javaconcepts.encapsulation;

/*
=====================================================
ENCAPSULATION / DATA BINDING IN JAVA
=====================================================

Definition:
Encapsulation means wrapping data (variables)
and methods (functions) together into a single unit (class).

It is achieved by:
1) Declaring variables as PRIVATE
2) Providing PUBLIC getter and setter methods

Advantages:
✔ Data hiding
✔ Better security
✔ Easy maintenance
✔ Control over data

Real Life Example:
Bank Account
You cannot access balance directly.
You must use methods like deposit() and withdraw().

=====================================================
*/

public class Student {

    // Private variables (Data Hiding)
    private String name;
    private int age;
    private double marks;

    /*
    Setter Methods
    Used to SET values
    */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        // Validation Example
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }

    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    /*
    Getter Methods
    Used to GET values
    */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

}