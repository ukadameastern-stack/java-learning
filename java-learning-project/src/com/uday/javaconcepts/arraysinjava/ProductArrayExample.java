package com.uday.javaconcepts.arraysinjava;

/*
This class demonstrates how to create
an array of ProductClass objects.
*/

import com.uday.javaconcepts.arraysinjava.ProductClass;

public class ProductArrayExample {

    public static void main(String[] args) {

        /*
        Creating an array that can store
        3 ProductClass objects
        */

        ProductClass[] productArray = new ProductClass[4];

        /*
        Initializing objects inside the array
        */

        productArray[0] = new ProductClass("Laptop", 101, 75000.50);
        productArray[1] = new ProductClass("Mobile", 102, 25000.75);
        productArray[2] = new ProductClass("Keyboard", 103, 1500.00);
        productArray[3] = productArray[2]; // Here just a new reference is created, not an object
        productArray[3].productName = "Mouse"; // So here, productArray[3] and productArray[2] will be similar.
        // java: incompatible types: java.lang.String cannot be converted to com.uday.javaconcepts.arraysinjava.ProductClass
        // productArray[3] = "Test message";
        // productArray[4] = productArray[2]; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

        /*
        Loop through array and print product details
        */

        for (ProductClass productObject : productArray) {
            System.out.println("Address: " + productObject.toString());
            productObject.displayProductDetails();
        }

    }
}

/*
Output:

Address: com.uday.javaconcepts.arraysinjava.ProductClass@7b23ec81
Product ID: 101
Product Name: Laptop
Product Price: 75000.5
-------------------------
Address: com.uday.javaconcepts.arraysinjava.ProductClass@27973e9b
Product ID: 102
Product Name: Mobile
Product Price: 25000.75
-------------------------
Address: com.uday.javaconcepts.arraysinjava.ProductClass@312b1dae
Product ID: 103
Product Name: Mouse
Product Price: 1500.0
-------------------------
Address: com.uday.javaconcepts.arraysinjava.ProductClass@312b1dae
Product ID: 103
Product Name: Mouse
Product Price: 1500.0
-------------------------
*/