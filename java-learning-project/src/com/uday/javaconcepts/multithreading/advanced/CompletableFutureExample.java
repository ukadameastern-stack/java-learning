package com.uday.javaconcepts.multithreading.advanced;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " Uday")
                .thenAccept(System.out::println);
    }
}

/*
OUTPUT:
Hello Uday
*/