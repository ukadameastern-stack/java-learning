package com.uday.javaconcepts.polymorphism.methodoverloading;

public class DifferentParameterCountExample {

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        DifferentParameterCountExample obj = new DifferentParameterCountExample();

        obj.display("Uday");
        obj.display("Uday", 30);

    }
}

/*
Details:
- Method display() overloaded with different number of parameters.

Output:
Name: Uday
Name: Uday, Age: 30
*/