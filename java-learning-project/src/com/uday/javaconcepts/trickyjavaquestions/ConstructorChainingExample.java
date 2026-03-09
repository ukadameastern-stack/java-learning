package com.uday.javaconcepts.trickyjavaquestions;

class Student {

    Student() {
        this("Uday");
        System.out.println("Default constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }
}

public class ConstructorChainingExample {

    public static void main(String[] args) {
        new Student();
    }
}

/*
Details:
- this() calls another constructor in the same class.
- It must be the first statement.

Output:
Name: Uday
Default constructor
*/