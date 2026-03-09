package com.uday.javaconcepts.trickyjavaquestions;

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingTrapExample {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}

/*
Details:
Parent reference → Child object.
Method decided at runtime.

Output:
Cat meows
*/