package com.uday.javaconcepts.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(() -> System.out.println("Task 1"));
        service.submit(() -> System.out.println("Task 2"));
        service.submit(() -> System.out.println("Task 11"));
        service.submit(() -> System.out.println("Task 22"));

        service.shutdown();
    }
}

/*
OUTPUT:
Task 1
Task 2
*/