
package com.uday.javaconcepts.userinput;

import java.util.Scanner;

public class UserDynamicInputExample {

    public static void main(String[] args) {

        Scanner inputScannerObject = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userNameValue = inputScannerObject.nextLine();

        System.out.print("Enter your age: ");
        int userAgeValue = inputScannerObject.nextInt();

        System.out.println("User Name: " + userNameValue);
        System.out.println("User Age: " + userAgeValue);

        /*
        Example Input:
        Enter your name: Uday
        Enter your age: 28

        Output:
        User Name: Uday
        User Age: 28
        */

        inputScannerObject.close();
    }
}
