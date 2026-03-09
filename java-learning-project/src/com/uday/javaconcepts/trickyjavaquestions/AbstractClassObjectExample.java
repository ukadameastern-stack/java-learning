package com.uday.javaconcepts.trickyjavaquestions;

abstract class Shape {

    abstract void draw();
}

class Square extends Shape {

    void draw() {
        System.out.println("Drawing square");
    }
}

public class AbstractClassObjectExample {

    public static void main(String[] args) {

        // Shape s = new Shape(); ❌ not allowed

        Shape s = new Square();
        s.draw();
        System.out.println("S for: " + s.getClass().getName());
    }
}

/*
Details:
Abstract class cannot create objects.
But parent reference can hold child object.

Output:
Drawing square
*/