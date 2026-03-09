package com.uday.javaconcepts.typecasting.objects;

/*
=========================================================
SAFE DOWNCASTING USING INSTANCEOF
=========================================================

Before performing Downcasting,
we should check the object type using:

instanceof operator

This prevents ClassCastException.

*/

class Shape {}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class InstanceOfExample {

    public static void main(String[] args) {

        Shape shape = new Circle();

        if (shape instanceof Circle) {

            Circle c = (Circle) shape;

            c.draw();
        }
    }
}

/*
OUTPUT
--------------------------------
Drawing Circle
*/