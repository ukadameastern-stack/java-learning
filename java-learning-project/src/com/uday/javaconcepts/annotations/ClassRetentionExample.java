package com.uday.javaconcepts.annotations;

import java.lang.annotation.*;

/*
=========================================================
RETENTION POLICY : CLASS
=========================================================

Meaning:
Annotation is stored in compiled .class file.

But JVM does NOT load it at runtime.

Used by:
Bytecode processing tools
*/

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@interface ClassInfo {
    String value();
}

@ClassInfo("Stored in class file")
class ClassExample {
}

public class ClassRetentionExample {

    public static void main(String[] args) {

        System.out.println("CLASS retention annotation example");
    }
}

/*
OUTPUT
--------------------------
CLASS retention annotation example
*/