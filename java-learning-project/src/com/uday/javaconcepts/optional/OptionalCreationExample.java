package com.uday.javaconcepts.optional;

import java.util.Optional;

/*
=========================================================
OPTIONAL CLASS IN JAVA
=========================================================

Definition
-----------
Optional is a container object that may or may not
contain a non-null value.

Purpose
--------
Avoid NullPointerException and write safer code.

Common creation methods:

Optional.of(value)
Optional.ofNullable(value)
Optional.empty()
*/

public class OptionalCreationExample {

    public static void main(String[] args) {

        String name = "Uday";

        Optional<String> optionalName = Optional.of(name);

        System.out.println(optionalName);


        String name2 = null;

        Optional<String> optionalName2 = Optional.ofNullable(name2);

        System.out.println(optionalName2);
    }
}

/*
OUTPUT
--------------------------------
Optional[Uday]
*/