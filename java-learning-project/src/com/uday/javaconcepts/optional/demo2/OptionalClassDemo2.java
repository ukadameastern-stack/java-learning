package com.uday.javaconcepts.optional.demo2;

import java.util.List;
import java.util.Optional;

public class OptionalClassDemo2 {
    public static void main(String[] args) {
        OptionalClassDemo2 demo = new OptionalClassDemo2();
        Optional<Product> productInfo = demo.getProduct(10);
        if (productInfo.isPresent()) {
            System.out.println(productInfo.get().getName());
        } else {
            System.out.println("Product not found");
        }

        // Using filter
        Optional<Product> productInfo1 = demo.getProduct(10);
        Optional<Product> opProduct = productInfo1.filter(p1-> !p1.isExpired());
        if (opProduct.isPresent()) {
            Product product = opProduct.get();
            System.out.println(product.getName());
        } else {
            System.out.println("Product expired");
        }

        // Using ifPresent
        Optional<Product> productInfo2 = demo.getProduct(10);
        productInfo2.ifPresent(p -> System.out.println(p.getName()));

        // Using ifPresentOrElse
        Optional<Product> productInfo3 = demo.getProduct(100);
        productInfo3.ifPresentOrElse(
                p -> System.out.println(p.getName()),
                () -> System.out.println("Product not found")
        );
    }

    Optional<Product> getProduct(int id) {
        List<Product> products = List.of(
                new Product(10, "Pen", false),
                new Product(11, "Book", false),
                new Product(13, "Pot", true)
        );

        return products.stream().filter(p -> p.getId() == id).findFirst();
    }
}
