package com.uday.javaconcepts.multithreading.lifecycle;

public class ThreadLifeCycleDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread LE");
                Thread.sleep(1000);
                System.out.println("Thread executed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(t.getState()); // NEW

        t.start();
        System.out.println(t.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println(t.getState()); // TIMED_WAITING

        t.join();
        System.out.println(t.getState()); // TERMINATED
    }
}

/*
OUTPUT:
NEW
RUNNABLE
TIMED_WAITING
Thread executed
TERMINATED
*/