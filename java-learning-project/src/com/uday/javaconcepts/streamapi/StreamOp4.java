package com.uday.javaconcepts.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOp4 {

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
                new ElectronicProduct(11, "iPhone 13", "Mobile", 65000, "USA", 6),
                new ElectronicProduct(12, "iPhone 15", "Mobile", 65000, "USA", 12)
        );

        System.out.println("==============nameOfProductQtyLt10===============");
        List<String> nameOfProductQtyLt10 = products.stream()
                .filter(product -> product.getQuantity() < 10)
                .map(ElectronicProduct::getName)
                .collect(Collectors.toList());

        System.out.println(nameOfProductQtyLt10);
        //==============nameOfProductQtyLt10===============
        //[Sony Bravia 55", Dell XPS 13, LG Refrigerator, Whirlpool Washing Machine, Apple MacBook Air M2, iPhone 13]

        System.out.println("==============nameOfProductQtyGt10===============");
        String nameOfProductQtyGt10 = products.stream()
                .filter(product -> product.getQuantity() > 10)
                .map(ElectronicProduct::getName)
                .collect(Collectors.joining(", "));

        System.out.println(nameOfProductQtyGt10);
        //==============nameOfProductQtyGt10===============
        // Samsung Galaxy S23, HP Pavilion, Boat Rockerz 450, Mi Smart Band 6

        System.out.println("==============idPrice===============");
        Map<Integer, Double> idPrice = products.stream()
                .collect(
                        Collectors.toMap(
                            ElectronicProduct::getId,
                            ElectronicProduct::getPrice
                        )
                );

        System.out.println(idPrice);
        //==============idPrice===============
        //{1=80000.0, 2=75000.0, 3=120000.0, 4=110000.0, 5=70000.0, 6=50000.0, 7=40000.0, 8=1500.0, 9=3000.0, 10=115000.0, 11=65000.0}

        System.out.println("==============avgPriceTypeWise===============");
        Map<String, Double> avgPriceTypeWise = products.stream()
                .collect(
                        Collectors.groupingBy(
                            ElectronicProduct::getName,
                            Collectors.averagingDouble(ElectronicProduct::getPrice)
                        )
                );
        System.out.println(avgPriceTypeWise);
        //==============avgPriceTypeWise===============
        //{Dell XPS 13=110000.0, Mi Smart Band 6=3000.0, iPhone 15=72500.0, iPhone 13=65000.0, Apple MacBook Air M2=115000.0, LG Refrigerator=50000.0, Boat Rockerz 450=1500.0, Whirlpool Washing Machine=40000.0, HP Pavilion=70000.0, Sony Bravia 55"=120000.0, Samsung Galaxy S23=75000.0}

        System.out.println("==============countProductCountryWise===============");
        Map<String, Long> countProductCountryWise = products.stream()
                .collect(
                        Collectors.groupingBy(
                                ElectronicProduct::getCountryOfOrigin,
                                Collectors.counting()
                        )
                );
        System.out.println(countProductCountryWise);
        //==============countProductCountryWise===============
        //{South Korea=2, USA=7, China=1, Japan=1, India=1}

        System.out.println("==============totalPrice===============");
        double totalPrice =
                products.stream()
                        .collect(Collectors.summingDouble(ElectronicProduct::getPrice));

        System.out.println(totalPrice);
        //==============totalPrice===============
        //794500.0

        System.out.println("==============totalPriceStats===============");
        DoubleSummaryStatistics totalPriceStats =
                products.stream()
                        .collect(Collectors.summarizingDouble(ElectronicProduct::getPrice));

        System.out.println(totalPriceStats);
        //==============totalPriceStats===============
        //DoubleSummaryStatistics{count=12, sum=794500.000000, min=1500.000000, average=66208.333333, max=120000.000000}

        System.out.println("==============PriceStatsPerType===============");
        Map<String, DoubleSummaryStatistics> statsByDept =
                products.stream()
                        .collect(Collectors.groupingBy(
                                ElectronicProduct::getType,
                                Collectors.summarizingDouble(ElectronicProduct::getPrice)
                        ));

        for (Map.Entry<String, DoubleSummaryStatistics> entry : statsByDept.entrySet()) {
            System.out.println(entry);
        }
        //==============PriceStatsPerType===============
        //Headphones=DoubleSummaryStatistics{count=1, sum=1500.000000, min=1500.000000, average=1500.000000, max=1500.000000}
        //Laptop=DoubleSummaryStatistics{count=3, sum=295000.000000, min=70000.000000, average=98333.333333, max=115000.000000}
        //TV=DoubleSummaryStatistics{count=1, sum=120000.000000, min=120000.000000, average=120000.000000, max=120000.000000}
        //Appliance=DoubleSummaryStatistics{count=2, sum=90000.000000, min=40000.000000, average=45000.000000, max=50000.000000}
        //Wearable=DoubleSummaryStatistics{count=1, sum=3000.000000, min=3000.000000, average=3000.000000, max=3000.000000}
        //Mobile=DoubleSummaryStatistics{count=4, sum=285000.000000, min=65000.000000, average=71250.000000, max=80000.000000}

        System.out.println("==============maxPrice===============");
        Double maxPrice = products.stream()
                .max(Comparator.comparingDouble(ElectronicProduct::getPrice))
                .map(ElectronicProduct::getPrice)
                .get();
        System.out.println(maxPrice);
        //==============maxPrice===============
        //120000.0





    }
}
