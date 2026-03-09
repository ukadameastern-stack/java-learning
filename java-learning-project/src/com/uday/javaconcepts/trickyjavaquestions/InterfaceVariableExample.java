package com.uday.javaconcepts.trickyjavaquestions;

interface Company {

    int MAX_EMPLOYEES = 100;
}

public class InterfaceVariableExample {

    public static void main(String[] args) {

        System.out.println("Max Employees: " + Company.MAX_EMPLOYEES);

        // Company.MAX_EMPLOYEES = 200; ❌ not allowed
    }
}

/*
Details:
Interface variables are:
public static final (Means CONSTANT)

Output:
Max Employees: 100
*/