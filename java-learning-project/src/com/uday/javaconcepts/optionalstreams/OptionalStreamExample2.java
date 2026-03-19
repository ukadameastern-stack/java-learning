package com.uday.javaconcepts.optionalstreams;

import com.uday.javaconcepts.optionalstreams.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalStreamExample2 {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer(1, "Uday", null, new Address("Pune")),
                new Customer(2, "Amol", null, null),
                new Customer(3, "Rahul", null, new Address("Mumbai"))
        );

        System.out.println(customers);
        List<String> cities =
                customers.stream()
                        .map(Customer::getAddress)   // Optional<Address>
                        .flatMap(Optional::stream)   // Address
                        .map(Address::getCity)
                        .toList();

        System.out.println(cities);
    }
}

/*
OUTPUT:
[Pune, Mumbai]
*/