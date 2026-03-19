package com.uday.javaconcepts.multithreading;

public class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("FirstThread.run(), status: " + this.getState());
        System.out.println(this.getThreadGroup());
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
