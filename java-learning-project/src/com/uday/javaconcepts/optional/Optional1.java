package com.uday.javaconcepts.optional;

import java.util.Optional;

public class Optional1 {

    public static void main(String[] args) {
        Optional<String> nameContainer = getNam();

        if (nameContainer.isPresent()) {
            String name = nameContainer.get();
            System.out.println(name.toUpperCase());
        }


    }

    private static Optional<String> getNam() {

        // Keep the actual value inside the Optional Object. Container Object.
        Optional<String> value = Optional.of("Uday");

        return value;
    }
}
