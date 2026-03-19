package com.uday.javaconcepts.optionalstreams.model;

import java.util.List;
import java.util.Optional;

public class Customer {

    private int id;
    private String name;
    private List<OrderM> orders; // can be null
    private Address address;    // can be null

    public Customer(int id, String name, List<OrderM> orders, Address address) {
        this.id = id;
        this.name = name;
        this.orders = orders;
        this.address = address;
    }

    public Optional<List<OrderM>> getOrders() {
        return Optional.ofNullable(orders);
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    public String getName() {
        return name;
    }
}