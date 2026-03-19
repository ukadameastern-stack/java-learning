package com.uday.javaconcepts.multithreading.basics;

public class LambdaThreadExample {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("Lambda thread running");
        });

        t.start();
    }
}

/*
OUTPUT:
Lambda thread running
*/