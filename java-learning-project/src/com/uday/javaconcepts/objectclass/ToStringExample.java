package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: toString()

    When we print an object using:

        System.out.println(object)

    Java internally calls:

        object.toString()

    If not overridden, output will be:

        ClassName@HexHashCode
*/

public class ToStringExample {

    public static void main(String[] args) {

        Student s = new Student(1, "Uday");

        System.out.println(s); // Java internally call s.toString() of object class

    }
}

/*
OUTPUT:

Student{id=1, name='Uday'}
*/