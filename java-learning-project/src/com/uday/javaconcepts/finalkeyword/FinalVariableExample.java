package com.uday.javaconcepts.finalkeyword;

public class FinalVariableExample {

    final int AGE = 30; // final variable

    public static void main(String[] args) {

        FinalVariableExample obj = new FinalVariableExample();

        System.out.println("Age: " + obj.AGE);

        // obj.AGE = 40;
        // ❌ Compile-time error: cannot assign value to final variable
    }
}

/*
Details:
- final variable value cannot be changed once assigned.
- It becomes a constant.

Output:
Age: 30
*/