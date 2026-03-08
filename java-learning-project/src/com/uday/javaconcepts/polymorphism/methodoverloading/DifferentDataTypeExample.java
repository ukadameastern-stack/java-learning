package com.uday.javaconcepts.polymorphism.methodoverloading;

public class DifferentDataTypeExample {

    void show(int num) {
        System.out.println("Integer value: " + num);
    }

    void show(double num) {
        System.out.println("Double value: " + num);
    }

    public static void main(String[] args) {

        DifferentDataTypeExample obj = new DifferentDataTypeExample();

        obj.show(10);
        obj.show(10.5);

    }
}

/*
Details:
- Same method name: show()
- Different data types: int and double.

Output:
Integer value: 10
Double value: 10.5
*/