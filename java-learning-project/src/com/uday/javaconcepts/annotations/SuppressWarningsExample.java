package com.uday.javaconcepts.annotations;

import java.util.ArrayList;
import java.util.List;

/*
=========================================================
@SuppressWarnings ANNOTATION
=========================================================

Definition
-----------
@SuppressWarnings is used to suppress compiler warnings.

Example:
unchecked warnings from raw collections.

*/

public class SuppressWarningsExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List list = new ArrayList(); // raw type

        list.add("Java");
        list.add("Programming");

        System.out.println(list);
    }
}

/*
OUTPUT
--------------------------------
[Java, Programming]
*/