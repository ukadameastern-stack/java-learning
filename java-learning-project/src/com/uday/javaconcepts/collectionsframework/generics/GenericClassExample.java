package com.uday.javaconcepts.collectionsframework.generics;

class Box<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericClassExample {

    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.set("Hello Generics");

        System.out.println(box.get());

    }
}

/*
o/p:
Hello Generics

 */