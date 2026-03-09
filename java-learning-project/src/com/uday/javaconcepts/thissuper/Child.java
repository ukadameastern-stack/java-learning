package com.uday.javaconcepts.thissuper;

/*
 Child class demonstrating:
 1. this keyword
 2. super keyword
*/
public class Child extends Parent {

    int number = 200;

    // Constructor
    Child() {

        /*
        super() calls parent constructor.
        It must be the first statement inside constructor.
        */
        super(); // Parent Constructor Called

        System.out.println("Child Constructor Called");
        /*
            o/p :
            Parent Constructor Called
            Child Constructor Called
         */
    }

    void showNumbers() {

        /*
        this.number refers to current class variable
        */
        System.out.println("Child number using this: " + this.number); // Child number using this: 200

        /*
        super.number refers to parent class variable
        */
        System.out.println("Parent number using super: " + super.number); // Parent number using super: 100
    }

    void display() {

        /*
        this.display() would call the current class method
        but here we are overriding the parent method
        */
        System.out.println("Child display() method"); // Child display() method

        /*
        super.display() calls parent class method
        */
        super.display(); // Parent display() method
    }
}