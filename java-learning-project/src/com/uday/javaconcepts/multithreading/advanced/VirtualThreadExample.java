package com.uday.javaconcepts.multithreading.advanced;

public class VirtualThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Thread vt = Thread.startVirtualThread(() -> {
            System.out.println("Running virtual thread: " + Thread.currentThread());
        });

        vt.join();
    }
}

/*
OUTPUT:
Running virtual thread: VirtualThread[#...]
*/