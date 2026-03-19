package com.uday.javaconcepts.optionalstreams;

import com.uday.javaconcepts.optionalstreams.model.Customer;
import com.uday.javaconcepts.optionalstreams.model.OrderM;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStreamExample4 {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer(1, "Uday",
                        Arrays.asList(new OrderM(1, 1000)), null),
                new Customer(
                        3,
                        "Vijay",
                        Arrays.asList(
                                new OrderM(1, 500),
                                new OrderM(2, 1000),
                                new OrderM(3, 1500)
                        ),
                        null),
                new Customer(2, "Amol", null, null)
        );

        double total =
                customers.stream()
                        .map(Customer::getOrders)      // Optional<List<Order>>
                        .flatMap(Optional::stream)     // List<Order>
                        .flatMap(List::stream)         // Order
                        .mapToDouble(OrderM::getAmount)
                        .sum();

        System.out.println(total);

        double vijayTotal =
                customers.stream()
                        .filter(c -> c.getName().equals("Vijay"))
                        .map(Customer::getOrders) // Optional<List<OrderM>>
                        .flatMap(Optional::stream) // List<OrderM>>
                        .flatMap(List::stream)
                        .mapToDouble(OrderM::getAmount)
                        .sum();


        System.out.println(vijayTotal);
    }
}

/*
OUTPUT:
4000.0
3000.0
*/