package com.uday.javaconcepts.interfaces;

interface Vehicle {

    default void start() {
        System.out.println("Vehicle starts");
    }

}
//class Car implements Vehicle {
class DefaultMethodExample  implements Vehicle {

    public static void main(String[] args) {

        DefaultMethodExample c = new DefaultMethodExample();
        c.start();

    }
}

/*
Details:
- Default methods have a body.
- Implementing classes can use them directly.

Output:
Vehicle starts
*/
