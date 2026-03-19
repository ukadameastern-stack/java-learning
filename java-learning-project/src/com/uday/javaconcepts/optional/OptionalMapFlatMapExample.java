package com.uday.javaconcepts.optional;

import com.uday.javaconcepts.optional.model.Address;
import com.uday.javaconcepts.optional.model.User;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void main(String[] args) {

        User user = new User(1, "Uday", new Address("Pune"));

        // map() example
        Optional<String> city1 =
                Optional.of(user)
                        .map(User::getAddress)     // Optional<Optional<Address>>
                        .flatMap(opt -> opt)       // flatten
                        .map(Address::getCity);

        System.out.println(
                city1.get()
        );

        // clean way using flatMap
        Optional<String> city2 =
                Optional.of(user)
                        .flatMap(User::getAddress)
                        .map(Address::getCity);

        System.out.println(city2.get());
    }
}

/*
OUTPUT:
Pune
Pune
*/