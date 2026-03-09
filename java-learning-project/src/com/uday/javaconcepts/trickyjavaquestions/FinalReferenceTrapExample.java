package com.uday.javaconcepts.trickyjavaquestions;

class Employee {

    String name = "Uday";
}

public class FinalReferenceTrapExample {

    public static void main(String[] args) {

        final Employee e = new Employee();

        e.name = "Rahul";

        System.out.println("Employee name: " + e.name);

        // e = new Employee(); ❌ not allowed
    }
}

/*
Details:
- final reference cannot change.
- But object data can change.

Output:
Employee name: Rahul
*/