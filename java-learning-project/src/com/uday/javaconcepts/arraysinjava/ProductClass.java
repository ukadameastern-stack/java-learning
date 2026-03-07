package com.uday.javaconcepts.arraysinjava;

/*
ProductClass represents a product in an inventory system.
Each object contains product details.
*/

public class ProductClass {

    String productName;
    int productId;
    double productPrice;

    // Constructor
    public ProductClass(String productName, int productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("-------------------------");
    }
}