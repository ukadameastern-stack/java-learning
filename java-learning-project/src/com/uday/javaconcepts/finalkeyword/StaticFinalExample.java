package com.uday.javaconcepts.finalkeyword;

public class StaticFinalExample {

    static final String COMPANY_NAME = "Eastern Enterprise";

    public static void main(String[] args) {

        System.out.println("Company: " + COMPANY_NAME);
    }
}

/*
Details:
- static final variables are constants.
- They belong to the class, not the object.
- Common naming convention: UPPER_CASE.

Output:
Company: Eastern Enterprise
*/