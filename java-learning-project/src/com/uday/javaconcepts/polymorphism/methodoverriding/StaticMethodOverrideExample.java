package com.uday.javaconcepts.polymorphism.methodoverriding;

class Parent {

    static void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {

    static void display() {
        System.out.println("Child static method");
    }
}

public class StaticMethodOverrideExample {

    public static void main(String[] args) {

        Parent obj = new Child();
        obj.display(); // Parent static method

        Child objC = new Child();
        objC.display(); // Child static method
    }
}

/*
Details:
- Static methods are not overridden.
- They are hidden.
- Method call depends on reference type.

Output:
Parent static method
Child static method
*/