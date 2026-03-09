package com.uday.javaconcepts.trickyjavaquestions;

public class StaticBlockExecutionExample {

    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}

/*
Details:
- Static blocks run when the class is loaded.
- They execute before the main method.

Output:
Static Block 1
Static Block 2
Main Method
*/