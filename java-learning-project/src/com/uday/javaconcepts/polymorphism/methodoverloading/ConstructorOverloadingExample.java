package com.uday.javaconcepts.polymorphism.methodoverloading;

public class ConstructorOverloadingExample {

    String name;
    int age;

    ConstructorOverloadingExample() {
        System.out.println("Default constructor called");
    }

    ConstructorOverloadingExample(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    ConstructorOverloadingExample(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        new ConstructorOverloadingExample();
        new ConstructorOverloadingExample("Uday");
        new ConstructorOverloadingExample("Uday", 30);

    }
}

/*
Details:
- Same constructor name but different parameters.
- Used to initialize objects in different ways.

Output:
Default constructor called
Name: Uday
Name: Uday, Age: 30
*/