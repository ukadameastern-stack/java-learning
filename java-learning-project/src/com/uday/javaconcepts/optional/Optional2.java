package com.uday.javaconcepts.optional;

import java.util.Optional;

public class Optional2 {

    public static void main(String[] args) {
        Optional<String> nameContainer = getName();

        if (nameContainer.isPresent()) {
            String name = nameContainer.get();
            System.out.println(name.toUpperCase());
        } else  {
            System.out.println("Value is empty/null");
        }

        if (nameContainer.isEmpty()) {
            System.out.println("Value is empty");
        } else {
            System.out.println(nameContainer.get().toUpperCase());
        }

    }

    private static Optional<String> getName() {

        String name = null;
        Optional<String> value;
        if (name == null) {
            value = Optional.empty();
        } else {
            value = Optional.of(name);
        }

        return value;
    }
}
