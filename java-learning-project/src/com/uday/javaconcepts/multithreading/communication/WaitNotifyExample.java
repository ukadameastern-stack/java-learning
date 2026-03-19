package com.uday.javaconcepts.multithreading.communication;

class Shared {
    synchronized void waitMethod() throws InterruptedException {
        System.out.println("Waiting...");
        wait();
        System.out.println("Resumed...");
    }

    synchronized void notifyMethod() {
        notify();
        System.out.println("Notified...");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {

        Shared s = new Shared();

        Thread t1 = new Thread(() -> {
            try {
                s.waitMethod();
            } catch (Exception e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(10);
                s.notifyMethod();
            } catch (Exception e) {}
        });

        t1.start();
        t2.start();
    }
}

/*
OUTPUT:
Waiting...
Notified...
Resumed...
*/