package com.uday.javaconcepts.optional.model;

import java.util.Optional;

public class User {
    private int id;
    private String name;
    private Address address; // can be null

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    public String getName() {
        return name;
    }
}