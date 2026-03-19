package com.uday.javaconcepts.optionalstreams.model;

public class OrderM {

    private int id;
    private double amount;

    public OrderM(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}