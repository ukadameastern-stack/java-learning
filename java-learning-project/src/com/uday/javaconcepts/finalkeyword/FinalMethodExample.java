package com.uday.javaconcepts.finalkeyword;

class Parent {

    final void show() {
        System.out.println("Parent final method");
    }
}

class Child extends Parent {

    // void show() {
    //     System.out.println("Child method");
    // }

    // ❌ Compile-time error
    // Final method cannot be overridden
}

public class FinalMethodExample {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
    }
}

/*
Details:
- final method cannot be overridden in child class.
- But it can be inherited.

Output:
Parent final method
*/