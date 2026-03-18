package com.uday.javaconcepts.methodreference;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMr {

    public static void main(String[] args) {

        // LE: Lambda Expression
        Predicate<String> predicate1 = s -> s.isBlank();
        boolean bool = predicate1.test("Hello");
        System.out.println(bool);

        Predicate<String> predicate2 = String::isBlank;
        System.out.println(predicate2.test("Hello"));
        System.out.println(predicate2.test(""));


    }
}
