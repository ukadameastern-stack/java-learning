package com.uday.javaconcepts.trickyjavaquestions;

class Person {

    String name = "Parent";

}

class Developer extends Person {

    String name = "Child";

    void printNames() {

        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);
    }
}

public class ThisVsSuperExample {

    public static void main(String[] args) {

        Developer d = new Developer();
        d.printNames();
    }
}

/*
Details:
this  -> current class reference
super -> parent class reference

Output:
Child name: Child
Parent name: Parent
*/