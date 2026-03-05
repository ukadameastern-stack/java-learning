package com.uday.javatopics;

public class ForLoopExamples {
    public static void main(String[] args) {
        String[] employeeNameList = {
                "Rahul",
                "Anita",
                "Vikram",
                "Sneha"
        };
        System.out.println("======== Employee Names ========");
        for (String currentEmployeeName : employeeNameList) {
            System.out.println("Processing employee: " + currentEmployeeName);
        }

        /*
        Output:
        Processing employee: Rahul
        Processing employee: Anita
        Processing employee: Vikram
        Processing employee: Sneha
        */

        double[] productPriceList = {199.99, 299.50, 150.75};
        System.out.println("========= Product Price List ========");
        for (double currentProductPrice : productPriceList) {
            System.out.println("Product price: " + currentProductPrice);
        }

        /*
        Output:
        Product price: 199.99
        Product price: 299.5
        Product price: 150.75
        */

        int[] userIdList = {101, 102, 103, 104};
        System.out.println(" ========= User Id List ========");
        for (int currentUserId : userIdList) {
            System.out.println("Sending notification to user ID: " + currentUserId);
        }

        /*
        Output:
        Sending notification to user ID: 101
        Sending notification to user ID: 102
        Sending notification to user ID: 103
        Sending notification to user ID: 104
        */
    }
}
