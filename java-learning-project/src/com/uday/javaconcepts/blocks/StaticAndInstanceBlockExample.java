package com.uday.javaconcepts.blocks;

/*
====================================================
TOPIC: Static Block vs Instance Block in Java
====================================================

1. Static Block
---------------
- Runs ONLY once when the class is loaded into memory.
- Executes before the main() method.
- Used for static initialization.

2. Instance Block
-----------------
- Runs every time an object is created.
- Executes BEFORE the constructor.

Execution Order
---------------
1. Static Block (once)
2. Instance Block
3. Constructor
4. Method Calls
*/

public class StaticAndInstanceBlockExample {

    private String employeeName;
    private int employeeId;

    /*
    ------------------------------------
    STATIC BLOCK
    ------------------------------------
    Runs only once when the class loads.
    */
    static {
        System.out.println("Static Block Executed");
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("Static Block Method Executed");
    }

    /*
    ------------------------------------
    INSTANCE BLOCK
    ------------------------------------
    Runs every time object is created.
    Runs BEFORE constructor.
    */
    {
        System.out.println("Instance Block Executed");
        instanceMethod();
    }

    public void instanceMethod() {
        System.out.println("Instance Block Method Executed");
    }

    /*
    ------------------------------------
    CONSTRUCTOR
    ------------------------------------
    Runs after instance block.
    */
    public StaticAndInstanceBlockExample(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;

        System.out.println("Constructor Executed");
        System.out.println("Employee Created: " + employeeName + " | ID: " + employeeId);
    }

    /*
    ------------------------------------
    NORMAL METHOD
    ------------------------------------
    */
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }

    /*
    ------------------------------------
    MAIN METHOD
    ------------------------------------
    */
    public static void main(String[] args) {

        System.out.println("Main Method Started\n");

        StaticAndInstanceBlockExample employeeOne =
                new StaticAndInstanceBlockExample("Uday", 101);

        employeeOne.displayEmployeeDetails();

        System.out.println("\nCreating second object\n");

        StaticAndInstanceBlockExample employeeTwo =
                new StaticAndInstanceBlockExample("Rahul", 102);

        employeeTwo.displayEmployeeDetails();
    }
}