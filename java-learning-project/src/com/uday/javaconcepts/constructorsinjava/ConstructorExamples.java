package com.uday.javaconcepts.constructorsinjava;

public class ConstructorExamples {

    /*
    ==========================================================
    1. Default Constructor (No Parameters)
    ==========================================================

    Important Details:
    - A constructor that does not accept parameters.
    - Used to initialize objects with default values.
    - If no constructor is written, Java automatically creates
      a default constructor (only if no other constructor exists).
    */

    String employeeName;
    int employeeAge;

    ConstructorExamples() {
        employeeName = "Unknown Employee";
        employeeAge = 0;
    }

    /*
    ==========================================================
    2. Parameterized Constructor
    ==========================================================

    Important Details:
    - Accepts parameters.
    - Used to initialize object variables with custom values.
    - Very common in real-world applications.
    */

    ConstructorExamples(String employeeNameParameter, int employeeAgeParameter) {
        employeeName = employeeNameParameter;
        employeeAge = employeeAgeParameter;
    }

    /*
    ==========================================================
    3. Constructor Overloading
    ==========================================================

    Important Details:
    - Multiple constructors with different parameter lists.
    - Java decides which constructor to call based on arguments.
    - Improves flexibility in object creation.
    */

    ConstructorExamples(String employeeNameParameter) {
        employeeName = employeeNameParameter;
        employeeAge = 18; // default age
    }

    /*
    ==========================================================
    4. Copy Constructor
    ==========================================================

    Important Details:
    - Copies values from another object.
    - Java does not provide built-in copy constructors
      like C++, so we manually define them.
    */

    ConstructorExamples(ConstructorExamples existingEmployeeObject) {
        employeeName = existingEmployeeObject.employeeName;
        employeeAge = existingEmployeeObject.employeeAge;
    }

    /*
    Method to display object details
    */

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        /*
        ==========================================================
        Example 1: Default Constructor
        ==========================================================
        */

        ConstructorExamples defaultEmployeeObject =
                new ConstructorExamples();

        defaultEmployeeObject.displayEmployeeDetails();

        /*
        Output:
        Employee Name: Unknown Employee
        Employee Age: 0
        ---------------------------
        */


        /*
        ==========================================================
        Example 2: Parameterized Constructor
        ==========================================================
        */

        ConstructorExamples parameterizedEmployeeObject =
                new ConstructorExamples("Uday Kadam", 28);

                // new ConstructorExamples(28, "Uday Kadam", 28); // java: no suitable constructor found for ConstructorExamples(int,java.lang.String,int)
                // new ConstructorExamples(28, "Uday Kadam"); // java: incompatible types: int cannot be converted to java.lang.String

        parameterizedEmployeeObject.displayEmployeeDetails();

        /*
        Output:
        Employee Name: Uday Kadam
        Employee Age: 28
        ---------------------------
        */


        /*
        ==========================================================
        Example 3: Constructor Overloading
        ==========================================================
        */

        ConstructorExamples overloadedEmployeeObject =
                new ConstructorExamples("Rahul Sharma");

        overloadedEmployeeObject.displayEmployeeDetails();

        /*
        Output:
        Employee Name: Rahul Sharma
        Employee Age: 18
        ---------------------------
        */


        /*
        ==========================================================
        Example 4: Copy Constructor
        ==========================================================
        */

        ConstructorExamples copiedEmployeeObject =
                new ConstructorExamples(parameterizedEmployeeObject);

        copiedEmployeeObject.displayEmployeeDetails();

        /*
        Output:
        Employee Name: Uday Kadam
        Employee Age: 28
        ---------------------------
        */

    }
}
