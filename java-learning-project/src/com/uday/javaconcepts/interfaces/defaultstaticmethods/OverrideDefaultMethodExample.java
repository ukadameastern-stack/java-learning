package com.uday.javaconcepts.interfaces.defaultstaticmethods;

/*
=========================================================
OVERRIDING DEFAULT METHODS
=========================================================

Default methods can be overridden by implementing
classes if custom behaviour is required.

*/

interface Greeting {

    default void sayHello() {
        System.out.println("Hello from Interface");
    }
}

class UserGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello from UserGreeting class");
    }
}

public class OverrideDefaultMethodExample {

    public static void main(String[] args) {

        UserGreeting g = new UserGreeting();

        g.sayHello();
    }
}

/*
OUTPUT
--------------------------------
Hello from UserGreeting class
*/