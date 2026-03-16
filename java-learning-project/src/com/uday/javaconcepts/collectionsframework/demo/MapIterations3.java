package com.uday.javaconcepts.collectionsframework.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterations3 {

    public static void main(String[] args) {

        HashMap<Integer, Order> orderInfo = new HashMap<>();
        orderInfo.put(1, new Order(1, "Mobile", 5));
        orderInfo.put(2, new Order(2, "Tablet", 4));
        orderInfo.put(3, new Order(3, "PC", 3));

        for (Map.Entry<Integer, Order> entry : orderInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
