package com.uday.javaconcepts.typecasting.objects;

/*
=========================================================
DOWNCASTING IN JAVA
=========================================================

Definition
-----------
Downcasting means converting Parent reference
back to Child reference.

Parent → Child

This must be done manually.

---------------------------------------------------------
Syntax
---------------------------------------------------------

Child obj = (Child) parentReference;

---------------------------------------------------------
Why Downcasting?
---------------------------------------------------------

To access child class specific methods.

*/

class Bird {

    void fly() {
        System.out.println("Bird can fly");
    }
}

class Parrot extends Bird {

    void speak() {
        System.out.println("Parrot can speak");
    }
}

public class DowncastingExample {

    public static void main(String[] args) {

        Bird bird = new Parrot();   // Upcasting

        Parrot parrot = (Parrot) bird;  // Downcasting

        parrot.fly();
        parrot.speak();
    }
}

/*
OUTPUT
--------------------------------
Bird can fly
Parrot can speak
*/