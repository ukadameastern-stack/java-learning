package com.uday.javaconcepts.polymorphism.methodoverriding;

class Person {

    void work() {
        System.out.println("Person works");
    }
}

class Developer extends Person {

    @Override
    void work() {

        super.work();   // calling parent method

        System.out.println("Developer writes code");
    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {

        Developer d = new Developer();
        d.work();
    }
}

/*
Details:
- super keyword is used to call parent class method.

Output:
Person works
Developer writes code
*/