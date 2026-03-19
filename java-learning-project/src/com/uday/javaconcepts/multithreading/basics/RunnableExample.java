package com.uday.javaconcepts.multithreading.basics;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

/*
OUTPUT:
Runnable thread: Thread-0
*/
