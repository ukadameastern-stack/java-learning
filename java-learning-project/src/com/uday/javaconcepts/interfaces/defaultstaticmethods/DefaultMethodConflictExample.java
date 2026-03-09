package com.uday.javaconcepts.interfaces.defaultstaticmethods;

/*
=========================================================
DEFAULT METHOD CONFLICT
=========================================================

If a class implements two interfaces
that contain the same default method,
Java forces the class to override it.

This avoids ambiguity.

*/

interface A {

    default void show() {
        System.out.println("Interface A");
    }
}

interface B {

    default void show() {
        System.out.println("Interface B");
    }
}

class TestClass implements A, B {

    @Override
    public void show() {
        System.out.println("Overridden method in TestClass");
    }
}

public class DefaultMethodConflictExample {

    public static void main(String[] args) {

        TestClass obj = new TestClass();

        obj.show();
    }
}

/*
OUTPUT
--------------------------------
Overridden method in TestClass
*/