
package com.uday.javaconcepts.loops;

public class LoopExamples {

    public static void main(String[] args) {

        int[] productPriceList = {100, 200, 300};

        for (int currentPrice : productPriceList) {
            System.out.println("Product Price: " + currentPrice);
        }

        /*
        Output:
        Product Price: 100
        Product Price: 200
        Product Price: 300
        */
    }
}
