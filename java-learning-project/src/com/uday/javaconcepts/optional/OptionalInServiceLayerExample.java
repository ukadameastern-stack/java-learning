package com.uday.javaconcepts.optional;

import java.util.Optional;

class UserRepository {
    public Optional<String> findUserById(int id) {
        if (id == 1) {
            return Optional.of("Uday");
        }
        return Optional.empty();
    }
}

public class OptionalInServiceLayerExample {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        String name = repo.findUserById(1).orElseThrow(
                () -> new RuntimeException("User not found")
        );

        System.out.println(name);
    }
}

/*
OUTPUT:
Exception in thread "main" java.lang.RuntimeException: User not found
*/