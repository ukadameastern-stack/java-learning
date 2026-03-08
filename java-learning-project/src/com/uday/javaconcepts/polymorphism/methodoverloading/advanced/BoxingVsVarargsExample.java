package com.uday.javaconcepts.polymorphism.methodoverloading.advanced;

public class BoxingVsVarargsExample {

    void show(Integer num) {
        System.out.println("Autoboxing method");
    }

    void show(int... num) {
        System.out.println("Varargs method");
    }

    public static void main(String[] args) {

        BoxingVsVarargsExample obj = new BoxingVsVarargsExample();

        obj.show(5);

    }
}

/*
Details:
- int → Integer (boxing)
- int → int... (varargs)

Priority:
Boxing > Varargs

Output:
Autoboxing method
*/