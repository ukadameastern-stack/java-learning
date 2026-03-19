package com.uday.javaconcepts.streamapi;

import java.util.Objects;

public class ElectronicProduct {

    private int id;
    private String name;
    private String type;
    private double price;
    private String countryOfOrigin;
    private int quantity;

    // Default Constructor
    public ElectronicProduct() {
    }

    // Parameterized Constructor
    public ElectronicProduct(int id, String name, String type,
                             double price, String countryOfOrigin, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString()
    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    // equals() and hashCode() (important for collections like Set/Map)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectronicProduct)) return false;
        ElectronicProduct that = (ElectronicProduct) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}