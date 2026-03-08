package com.uday.javaconcepts.interfaceconcepts;

@FunctionalInterface
interface Greeting {

    void sayHello(String name);
    // Functional interface contains only one abstract method.
    // Multiple non-overriding abstract methods found in Greeting
    //void sayGoodbye(String name);
}

public class FunctionalInterfaceExample implements Greeting {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void sayGoodbye(String name) {
        System.out.println("GoodBye " + name);
    }

    public static void main(String[] args) {

        FunctionalInterfaceExample f = new FunctionalInterfaceExample();

        f.sayHello("Uday");
        f.sayGoodbye("Uday");
    }
}

/*
Details:
- Functional interface contains only one abstract method.
- Used in Lambda expressions and streams.

Output:
Hello Uday
*/
