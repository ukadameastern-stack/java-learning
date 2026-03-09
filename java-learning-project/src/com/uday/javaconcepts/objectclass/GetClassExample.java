package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: getClass()

    Defined in Object class.

    Signature:
        public final Class<?> getClass()

    Purpose:
    Returns runtime class information of object.

    Used in:
        Reflection
        Frameworks
        Logging
*/

public class GetClassExample {

    public static void main(String[] args) {

        Student s = new Student(1, "Uday");

        System.out.println(s.getClass());

    }
}

/*
OUTPUT:

class com.uday.javaconcepts.object.Student
*/