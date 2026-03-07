package com.uday.javaconcepts.inheritance;

/*
Hierarchical Inheritance

        Animal
       /      \
     Dog      Cat
*/

class Animal {

    void eatFood() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    void barkSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void meowSound() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Dog dogObject = new Dog();
        dogObject.eatFood();
        dogObject.barkSound();

        Cat catObject = new Cat();
        catObject.eatFood();
        catObject.meowSound();
    }
}

/*
OUTPUT

Animal eats food
Dog barks
Animal eats food
Cat meows
*/