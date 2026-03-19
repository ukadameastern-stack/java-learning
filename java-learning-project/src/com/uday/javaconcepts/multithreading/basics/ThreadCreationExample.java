package com.uday.javaconcepts.multithreading.basics;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Main Thread: " + Thread.currentThread().getName());
    }
}

/*
OUTPUT:
Main Thread: main
Thread running: Thread-0
*/