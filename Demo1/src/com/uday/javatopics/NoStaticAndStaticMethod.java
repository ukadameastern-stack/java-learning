package com.uday.javatopics;

public class NoStaticAndStaticMethod {

    int number = 10;
    static int staticNumber = 20;

    public void nonStaticMethod() {
        System.out.println("Inside nonStaticMethod: Static variable: " + staticNumber);
    }

    public void nonStaticSubMethod() {
        System.out.println("Inside nonStaticSubMethod : Static variable: " + staticNumber);
        System.out.println("Inside nonStaticSubMethod : Non-Static variable: " + number);

        // Calling static method (safe)
        staticAdditionMethod();
        nonStaticMethod();
    }

    public static void staticAdditionMethod() {
        System.out.println("Inside staticAdditionMethod : Static variable: " + staticNumber);
        // error: non-static method nonStaticMethod() cannot be referenced from a static context
        // nonStaticMethod();
        // error: non-static variable number cannot be referenced from a static context
        // System.out.println("Inside staticAdditionMethod : Non-Static variable: " + number);

        // Non-static methods and variables we can access only when we create an object of that class
        // Pattern.Java.NoStaticAndStaticMethod obj = new Pattern.Java.NoStaticAndStaticMethod();
        // obj.nonStaticSubMethod();
    }

    public static void main(String[] args) {

        staticAdditionMethod();  // OK

        NoStaticAndStaticMethod obj = new NoStaticAndStaticMethod();
        obj.nonStaticSubMethod();  // OK
    }
}