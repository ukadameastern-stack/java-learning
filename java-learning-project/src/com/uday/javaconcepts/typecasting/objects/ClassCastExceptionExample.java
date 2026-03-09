package com.uday.javaconcepts.typecasting.objects;

/*
=========================================================
CLASSCASTEXCEPTION IN DOWNCASTING
=========================================================

If the object is NOT actually an instance of the
child class, Downcasting causes runtime exception.

Exception:
ClassCastException

*/

class Parent {}

class Child extends Parent {}

public class ClassCastExceptionExample {

    public static void main(String[] args) {

        Parent parent = new Parent();

        // Unsafe Downcasting
        Child child = (Child) parent;

        System.out.println(child);
    }
}

/*
OUTPUT
--------------------------------
Exception in thread "main"
java.lang.ClassCastException
*/