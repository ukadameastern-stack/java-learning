package com.uday.javaconcepts.arraysinjava;

import java.util.Arrays;
import java.util.Collections;

/*
Example: Sorting array elements.
Common use: ranking scores or ordering data.
*/

public class ArraySortingExample {

    public static void main(String[] args) {

        int[] productPriceArray = {450, 120, 800, 300, 150};

        Arrays.sort(productPriceArray);

        System.out.println("Sorted Prices: ASC");

        for (int price : productPriceArray) {
            System.out.println(price);
        }

        /**
         * int[] → primitive type ❌ cannot use reverseOrder()
         * Integer[] → object wrapper ✅ works
         */
        Integer[] numbers = {5, 2, 8, 1, 9};

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Descending Order:");
        System.out.println(Arrays.toString(numbers));

        int[] reserve = new int[3];
        Arrays.sort(reserve);
        System.out.println("Reserve Order:");
        System.out.println(Arrays.toString(reserve));
    }
}

/*
Output

Sorted Prices:
120
150
300
450
800
*/