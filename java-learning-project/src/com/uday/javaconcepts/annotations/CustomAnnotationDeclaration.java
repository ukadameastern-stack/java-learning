package com.uday.javaconcepts.annotations;

import java.lang.annotation.*;

/*
=========================================================
DECLARING CUSTOM ANNOTATIONS
=========================================================

Java allows developers to create their own annotations.

Syntax:

@interface AnnotationName
{
}

Annotations are declared using @interface keyword.

---------------------------------------------------------------------------
| Retention Policy | Meaning                                              |
| ---------------- | ---------------------------------------------------- |
| `SOURCE`         | Exists only in source code (removed by compiler)     |
| `CLASS`          | Stored in `.class` file but not available at runtime |
| `RUNTIME`        | Available during runtime via reflection              |
---------------------------------------------------------------------------

@Retention and @Target are meta-annotations.
They provide metadata about another annotation
(i.e., they define how your custom annotation behaves).

They belong to the package:

    import java.lang.annotation.*;

1. @Retention(RetentionPolicy.RUNTIME)
Meaning

@Retention defines how long the annotation will be available in the program.

RetentionPolicy.RUNTIME means:
The annotation will be available at runtime and can be accessed using Reflection.

---------------------------------------------------------
Meta Annotations
---------------------------------------------------------

@Retention
@Target
@Documented
@Inherited

---------------------------------------------------------
Example
---------------------------------------------------------
We create a custom annotation called @Author

*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

@interface Author {

    String name();

    String date();
}

@Author(name = "Uday", date = "2026")
class ProjectModule {

}

public class CustomAnnotationDeclaration {

    public static void main(String[] args) {

        ProjectModule module = new ProjectModule();

        System.out.println("Custom annotation applied successfully");
    }
}

/*
OUTPUT
--------------------------------
Custom annotation applied successfully
*/