package com.uday.javaconcepts.annotations;

import java.lang.annotation.*;

/*
=========================================================
RETENTION POLICY : SOURCE
=========================================================

Meaning:
Annotation exists only in source code.

Compiler removes it during compilation.
It will NOT appear in the .class file.

Used by tools like:
- Code analyzers
- IDE hints
*/

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface SourceInfo {
    String value();
}

@SourceInfo("Used only during compilation")
class SourceExample {
}

public class SourceRetentionExample {

    public static void main(String[] args) {

        System.out.println("SOURCE retention annotation example");
    }
}

/*
OUTPUT
--------------------------
SOURCE retention annotation example
*/