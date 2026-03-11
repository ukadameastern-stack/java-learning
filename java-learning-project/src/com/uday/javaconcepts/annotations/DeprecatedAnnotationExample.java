package com.uday.javaconcepts.annotations;

/*
=========================================================
@DEPRECATED ANNOTATION
=========================================================

Definition
-----------
@Deprecated indicates that a method or class
should NOT be used anymore.

It is kept only for backward compatibility.

When used, the compiler shows a warning.

*/

class OldCalculator {

    @Deprecated
    void oldAddMethod() {
        System.out.println("Old add method");
    }

    void newAddMethod() {
        System.out.println("New add method");
    }
}

public class DeprecatedAnnotationExample {

    public static void main(String[] args) {

        OldCalculator calc = new OldCalculator();

        calc.oldAddMethod(); // compiler warning
        calc.newAddMethod();
    }
}

/*
OUTPUT
--------------------------------
Old add method
New add method
*/