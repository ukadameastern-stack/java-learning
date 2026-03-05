
package com.uday.javaconcepts.switchstatements;

public class SwitchStatementExample {

    public static void main(String[] args) {

        String httpRequestMethod = "GET";

        switch (httpRequestMethod) {

            case "GET":
                System.out.println("Fetching data from server");
                break;

            case "POST":
                System.out.println("Creating data on server");
                break;

            case "DELETE":
                System.out.println("Deleting data from server");
                break;

            default:
                System.out.println("Invalid request method");
        }

        // Output: Fetching data from server
    }
}
