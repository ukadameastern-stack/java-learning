package com.uday.javaconcepts.polymorphism.methodoverriding;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class BasicMethodOverridingExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }
}

/*
Details:
- Method sound() in Dog overrides the method in Animal.
- Same method name, parameters, and return type.

Output:
Dog barks
*/