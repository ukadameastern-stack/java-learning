package com.uday.javaconcepts.optional;

import java.util.Optional;

public class Optional5 {

    public static void main(String[] args) {
        Optional<String> nameContainer = getName();

        //nameContainer.orElseThrow(); // NoSuchElementException

        nameContainer.orElseThrow(
                () -> {
                    return new RuntimeException("No data");
                }
        );

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
