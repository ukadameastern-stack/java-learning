package com.uday.javaconcepts.multithreading.faq;

public class ThreadFAQ {

    public static void main(String[] args) {

        // Q1: start() vs run()
        Thread t = new Thread(() -> System.out.println("Thread executed"));

        t.run();   // runs in main thread
        t.start(); // runs in separate thread

        /*
        OUTPUT:
        Thread executed
        Thread executed
        */

        // Q2: sleep vs wait
        /*
        sleep():
        - belongs to Thread class
        - does NOT release lock

        wait():
        - belongs to Object class
        - releases lock
        */

        // Q3: Callable vs Runnable
        /*
        Runnable:
        - no return
        - no checked exception

        Callable:
        - returns value
        - throws exception
        */

        // Q4: Why synchronization?
        /*
        To avoid race condition
        */
    }
}