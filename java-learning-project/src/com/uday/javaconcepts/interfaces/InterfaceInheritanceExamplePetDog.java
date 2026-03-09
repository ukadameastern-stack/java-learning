package com.uday.javaconcepts.interfaces;

interface Animal1 {
    void eat();
}

interface Dog extends Animal1 {
    void bark();
}

class InterfaceInheritanceExamplePetDog implements Dog {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        InterfaceInheritanceExamplePetDog d = new InterfaceInheritanceExamplePetDog();

        d.eat();
        d.bark();
    }
}

/*
Details:
- Interface Dog extends interface Animal.
- Class implementing Dog must implement methods from both interfaces.

Output:
Dog eats food
Dog barks
*/