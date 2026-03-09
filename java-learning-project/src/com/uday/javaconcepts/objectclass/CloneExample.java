package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: clone()

    Creates duplicate object.

    Steps to enable cloning:

    1. Implement Cloneable interface
    2. Override clone() method
    3. Call clone()

    Important:
    clone() performs shallow copy by default.
*/

public class CloneExample {

    public static void main(String[] args) throws Exception {

        Student s1 = new Student(1, "Uday");

        Student s2 = (Student) s1.clone();
        Student s3 = (Student) s1.clone();
        s3.name = "Kadam";

        System.out.println(s1); // Student{id=1, name='Uday'}
        System.out.println(s2); // Student{id=1, name='Uday'}
        System.out.println(s3); // Student{id=1, name='Kadam'}
        System.out.println(s1.hashCode()); // 2631464
        System.out.println(s2.hashCode()); // 2631464
        System.out.println(s3.hashCode()); // 72253019

    }
}

/*
OUTPUT:

Student{id=1, name='Uday'}
Student{id=1, name='Uday'}
Student{id=1, name='Kadam'}
2631464
2631464
72253019

Both objects contain same data but are different objects in memory.
*/