package com.uday.javaconcepts.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

/*
=========================================================
RETENTION POLICY : RUNTIME
=========================================================

Meaning:
Annotation is available during runtime
and can be accessed using reflection.

Used by frameworks like:
Spring
Hibernate
JUnit
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RuntimeInfo {
    String author();
}

@RuntimeInfo(author = "Uday")
class RuntimeExample {
}

public class RuntimeRetentionExample {

    public static void main(String[] args) {

        Class<RuntimeExample> obj = RuntimeExample.class;

        if (obj.isAnnotationPresent(RuntimeInfo.class)) {

            RuntimeInfo info = obj.getAnnotation(RuntimeInfo.class);

            System.out.println("Author: " + info.author());
        }
    }
}

/*
OUTPUT
--------------------------
Author: Uday
*/