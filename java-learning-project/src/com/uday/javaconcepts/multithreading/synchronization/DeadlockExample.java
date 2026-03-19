package com.uday.javaconcepts.multithreading.synchronization;

public class DeadlockExample {

    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("T1 locked lock1");
                synchronized (lock2) {
                    System.out.println("T1 locked lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("T2 locked lock2");
                synchronized (lock1) {
                    System.out.println("T2 locked lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

/*
OUTPUT:
May get stuck (Deadlock)
*/