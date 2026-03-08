package com.uday.javaconcepts.interfaceconcepts;

interface MathUtility {

    static int square(int num) {
        return num * num;
    }

}

public class StaticMethodInterfaceExample {

    public static void main(String[] args) {

        int result = MathUtility.square(5);

        System.out.println("Square: " + result);
    }
}

/*
Details:
- Static methods belong to the interface.
- Called using interface name.

Output:
Square: 25
*/