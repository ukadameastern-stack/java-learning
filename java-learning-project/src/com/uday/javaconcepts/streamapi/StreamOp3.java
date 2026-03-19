package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOp3 {

    public static void main(String[] args) {

        List<ElectronicProduct> products = List.of(
                new ElectronicProduct(1, "iPhone 15", "Mobile", 80000, "USA", 10),
                new ElectronicProduct(2, "Samsung Galaxy S23", "Mobile", 75000, "South Korea", 15),
                new ElectronicProduct(3, "Sony Bravia 55\"", "TV", 120000, "Japan", 6),
                new ElectronicProduct(4, "Dell XPS 13", "Laptop", 110000, "USA", 7),
                new ElectronicProduct(5, "HP Pavilion", "Laptop", 70000, "USA", 12),
                new ElectronicProduct(6, "LG Refrigerator", "Appliance", 50000, "South Korea", 8),
                new ElectronicProduct(7, "Whirlpool Washing Machine", "Appliance", 40000, "USA", 6),
                new ElectronicProduct(8, "Boat Rockerz 450", "Headphones", 1500, "India", 25),
                new ElectronicProduct(9, "Mi Smart Band 6", "Wearable", 3000, "China", 20),
                new ElectronicProduct(10, "Apple MacBook Air M2", "Laptop", 115000, "USA", 6),
                new ElectronicProduct(11, "iPhone 13", "Mobile", 65000, "USA", 6)
        );

        // Print all products
        // products.forEach(System.out::println);

        System.out.println("==============allUsaCountryMobIdsAndName===============");
        Map<Integer, String> allUsaCountryMobIdsAndName = products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("Mobile"))
                .filter(product -> product.getCountryOfOrigin().equalsIgnoreCase("USA"))
                .collect(
                        Collectors.toMap(
                                ElectronicProduct::getId,
                                ElectronicProduct::getName
                        )
                );
        System.out.println(allUsaCountryMobIdsAndName);
        //==============allUsaCountryMobIdsAndName===============
        //{1=iPhone 15, 11=iPhone 13}

        System.out.println("==============productCountryList===============");
        List<String> productCountryList = products.stream()
                .map(ElectronicProduct::getCountryOfOrigin)
                .toList();

        System.out.println(productCountryList);
        //==============productCountryList===============
        //[USA, South Korea, Japan, USA, USA, South Korea, USA, India, China, USA, USA]

        System.out.println("==============uniqueProductCountryList===============");
        products.stream()
                .map(ElectronicProduct::getCountryOfOrigin)
                .distinct()
                .forEach(System.out::println);
        //==============uniqueProductCountryList===============
        //USA
        //South Korea
        //Japan
        //India
        //China

        System.out.println("==============first3===============");
        products.stream().limit(2).forEach(System.out::println);
        //==============first3===============
        //ElectronicProduct{id=1, name='iPhone 15', type='Mobile', price=80000.0, countryOfOrigin='USA', quantity=10}
        //ElectronicProduct{id=2, name='Samsung Galaxy S23', type='Mobile', price=75000.0, countryOfOrigin='South Korea', quantity=15}

        System.out.println("==============laptopProductExist===============");
        Boolean laptopProductExist = products.stream().anyMatch(product -> product.getType().equalsIgnoreCase("Laptop"));
        System.out.println(laptopProductExist);
        //==============laptopProductExist===============
        //true

        System.out.println("==============everyProductStockGt5===============");
        Boolean everyProductStockGt5 = products.stream().allMatch(p -> p.getQuantity() > 5);
        System.out.println(everyProductStockGt5);
        //==============everyProductStockGt5===============
        //true

        System.out.println("==============everyProductPriceLt2k===============");
        Boolean everyProductPriceLt2k = products.stream().noneMatch(p -> p.getPrice() > 2000);
        System.out.println(everyProductPriceLt2k);
        //==============everyProductPriceLt2k===============
        //false

        System.out.println("==============LED not exist ===============");
        System.out.println(products.stream().noneMatch(p -> p.getType().equalsIgnoreCase("LED")));
        //==============LED not exist ===============
        //true

        System.out.println("==============Find Any ===============");
        products.stream().peek(p -> System.out.println("Id: " + p.getId())).findAny().ifPresent(System.out::println);
        //==============Find Any ===============
        //Id: 1
        //ElectronicProduct{id=1, name='iPhone 15', type='Mobile', price=80000.0, countryOfOrigin='USA', quantity=10}

        System.out.println("==============ProductPriceSort===============");
        Map<Integer, Double> productPriceSort =
                products.stream()
                        .sorted(Comparator.comparingDouble(ElectronicProduct::getPrice))
                        .collect(Collectors.toMap(
                                ElectronicProduct::getId,
                                ElectronicProduct::getPrice,
                                (a, b) -> a,
                                LinkedHashMap::new
                        ));
        System.out.println(productPriceSort);
        //==============ProductPriceSort===============
        //{8=1500.0, 9=3000.0, 7=40000.0, 6=50000.0, 11=65000.0, 5=70000.0, 2=75000.0, 1=80000.0, 4=110000.0, 10=115000.0, 3=120000.0}


    }
}
