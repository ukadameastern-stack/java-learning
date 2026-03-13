package com.uday.javaconcepts.collectionsframework.generics;

import java.util.ArrayList;

/*
Generics in Java (Java 21)

    Generics allow you to write classes, interfaces, and methods
    that work with different data types while maintaining compile-time type safety.

They were introduced in Java 5 and are still a core feature in Java 21.
Java 21 does not fundamentally change generics, but they remain essential in APIs
like the Java Collections Framework.

------------------------------------------
1. Why Generics Are Needed
------------------------------------------

    Before generics, collections stored Object types.

Without Generics (Old Java):

    import java.util.ArrayList;

    public class WithoutGenerics {
        public static void main(String[] args) {

            ArrayList list = new ArrayList();

            list.add("Java");
            list.add(10);   // allowed

            String s = (String) list.get(0);

            System.out.println(s);
        }
    }

Problems:

    | Issue          | Explanation                   |
    | -------------- | ----------------------------- |
    | No Type Safety | Any object can be added       |
    | Runtime Errors | `ClassCastException` possible |
    | Manual Casting | Required                      |

 */
public class GenericsExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        // list.add(10); // Compile-time error

        String s = list.get(0);

        System.out.println(s);
    }
}

/*
o/p: Java

Benefits:

    | Benefit          | Explanation                          |
    | ---------------- | ------------------------------------ |
    | Type Safety      | Errors caught at compile time        |
    | No Casting       | Automatic type checking              |
    | Code Reusability | Generic classes work with many types |
    | Cleaner Code     | Less boilerplate                     |


 */

