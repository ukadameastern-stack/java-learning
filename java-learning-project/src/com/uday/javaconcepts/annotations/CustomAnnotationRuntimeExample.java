package com.uday.javaconcepts.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

/*
=========================================================
ACCESSING CUSTOM ANNOTATIONS AT RUNTIME
=========================================================

Annotations can be accessed using Reflection
if their retention policy is RUNTIME.

*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

@interface Developer {

    String name();

    String role();
}

@Developer(name = "Uday", role = "Java Developer")
class ApplicationModule {

}

@Developer(name = "Kadam", role = "PHP Developer")
class SubApplicationModule {

}

public class CustomAnnotationRuntimeExample {

    public static void main(String[] args) {

        Class<ApplicationModule> obj = ApplicationModule.class;
        if (obj.isAnnotationPresent(Developer.class)) {

            Developer dev = obj.getAnnotation(Developer.class);

            System.out.println("Developer Name: " + dev.name());
            System.out.println("Role: " + dev.role());
        }

        // SubApplicationModule objS = new SubApplicationModule();
        // Cannot resolve method 'isAnnotationPresent' in 'SubApplicationModule'
        // if (objS.isAnnotationPresent(Developer.class)) {}
        Class<SubApplicationModule> subObj = SubApplicationModule.class;
        if (subObj.isAnnotationPresent(Developer.class)) {
            Developer dev2 = subObj.getAnnotation(Developer.class);
            System.out.println("Developer Name: " + dev2.name());
            System.out.println("Role: " + dev2.role());
        }
    }
}

/*
OUTPUT
--------------------------------
Developer Name: Uday
Role: Java Developer
Developer Name: Kadam
Role: PHP Developer
*/