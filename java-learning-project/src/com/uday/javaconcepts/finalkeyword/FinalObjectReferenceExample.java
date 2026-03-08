package com.uday.javaconcepts.finalkeyword;

class Student {

    String name = "Uday";

}

public class FinalObjectReferenceExample {

    public static void main(String[] args) {

        final Student s = new Student();

        s.name = "Rahul"; // ✔ allowed (object state can change)

        System.out.println("Student Name: " + s.name);

        // s = new Student();
        // java: cannot assign a value to final variable s
        // ❌ not allowed (reference cannot change)
    }
}

/*
Details:
- final object reference cannot point to another object.
- But object data can still be modified.

Output:
Student Name: Rahul
*/