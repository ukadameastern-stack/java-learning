package com.uday.javaconcepts.polymorphism.methodoverloading.advanced;

public class VarargsExample {

    void sum(int... numbers) {

        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {

        VarargsExample obj = new VarargsExample();

        obj.sum(10, 20);
        obj.sum(5, 5, 5, 5);

    }
}

/*
Details:
- varargs allow passing any number of arguments.

Output:
Total: 30
Total: 20
*/