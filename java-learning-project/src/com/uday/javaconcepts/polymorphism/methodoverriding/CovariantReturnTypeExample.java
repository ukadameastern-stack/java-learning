package com.uday.javaconcepts.polymorphism.methodoverriding;

class Animal2 {
}

class Dog2 extends Animal2 {
}

class Animal2Factory {

    Animal2 createAnimal2() {
        return new Animal2();
    }
}

class Dog2Factory extends Animal2Factory {

    @Override
    Dog2 createAnimal2() {
        return new Dog2();
    }
}

public class CovariantReturnTypeExample {

    public static void main(String[] args) {

        Dog2Factory factory = new Dog2Factory();

        Animal2 a = factory.createAnimal2();

        System.out.println("Animal2 created: " + a.getClass().getSimpleName());
    }
}

/*
Details:
- Child method can return a subclass type.
- This is called Covariant Return Type.

Output:
Animal2 created: Dog2
*/