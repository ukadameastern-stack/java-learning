package com.uday.javaconcepts.optionalstreams;

import com.uday.javaconcepts.optionalstreams.model.Customer;
import com.uday.javaconcepts.optionalstreams.model.OrderM;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalStreamExample1 {

    public static void main(String[] args) {

        Customer customer = new Customer(
                1,
                "Uday",
                Arrays.asList(new OrderM(1, 500), new OrderM(2, 1500)),
                null
        );

        double totalAmount = customer
                .getOrders()
                .orElse(List.of())
                .stream()
                .mapToDouble(OrderM::getAmount)
                .sum();

        System.out.println(totalAmount);

        Double average1 = customer
                .getOrders()
                .orElse(List.of())
                .stream()
                .mapToDouble(orderM -> orderM.getAmount())
                .average()
                .orElse(0.0);;

        System.out.println(average1);

        OptionalDouble average = customer
                .getOrders()
                .orElse(List.of())
                .stream()
                //.mapToDouble(orderM -> orderM.getAmount())
                .mapToDouble(OrderM::getAmount)
                .average();

        System.out.println(average.getAsDouble());
    }
}

/*
OUTPUT:
2000.0
*/