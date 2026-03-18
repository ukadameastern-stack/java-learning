package com.uday.javaconcepts.methodreference;

import java.util.function.Function;

public class FunctionMr {

    public static void main(String[] args) {

        // LE: Lambda Expression
        Function<String, Integer> var = s -> s.length();

        System.out.println(var.apply("Hello"));

        // MR: Method Reference
        Function<String, Integer> var2 = String::length;
        System.out.println(var2.apply("Hello"));

        Function<String, Boolean> var3 = s -> s.contains("Hel");
        System.out.println(var3.apply("Hello"));

        Function<String, Boolean> var33 = s -> s.matches("Hello");
        System.out.println(var33.apply("Hello"));

        // Non-static method cannot be referenced from a static context
        // java: incompatible types: invalid method reference
        //    unexpected instance method contains(java.lang.CharSequence) found in unbound lookup
        // Function<String, Integer> var4 = String::contains;
        Function<String, String> var4 = String::toLowerCase;
        System.out.println(var4.apply("Hello"));
    }
}
