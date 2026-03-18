package com.uday.javaconcepts.optional;

import com.uday.javaconcepts.methodreference.StringOp;

import java.util.Optional;

public class Optional6 {

    public static void main(String[] args) {
        Optional<String> nameContainer = getName();

        // System.out.println(nameContainer.get()); // if Null then -> NoSuchElementException

        Optional<String> result = nameContainer.filter(
                (n) -> {
                    System.out.println("Inside filter");
                    System.out.println("Op : " + n.toUpperCase());
                    return n.equalsIgnoreCase("Uday Kadam");
                }
        ).or(
                () -> {
                    return Optional.of("Uday Kadam the Original");
                }
        );

        System.out.println(result.get());
        // if Null then -> NoSuchElementException
        // if value not match  -> NoSuchElementException
    }

    private static Optional<String> getName() {

        String name = "Uday Kadam";
        name = null;
        Optional<String> value;
        if (name == null) {
            value = Optional.empty();
        } else {
            value = Optional.of(name);
        }

        return value;
    }
}
