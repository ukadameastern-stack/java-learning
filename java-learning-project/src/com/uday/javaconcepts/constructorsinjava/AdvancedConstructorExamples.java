package com.uday.javaconcepts.constructorsinjava;

public class AdvancedConstructorExamples {

    /*
    ==========================================================
    1. Private Constructor (Used in Singleton / Utility Classes)
    ==========================================================

    Important Details:
    - A private constructor cannot be accessed outside the class.
    - Used to restrict object creation.
    - Commonly used in Singleton design pattern or utility classes.
    */

    private AdvancedConstructorExamples() {
        System.out.println("Private constructor called");
    }


    /*
    ==========================================================
    2. Constructor Chaining using this()
    ==========================================================

    Important Details:
    - Constructor can call another constructor using this().
    - Must be the FIRST statement in the constructor.
    - Helps avoid duplicate initialization code.
    */

    String productName;
    double productPrice;

    AdvancedConstructorExamples(String productNameParameter) {
        this(productNameParameter, 0.0); // calling another constructor
    }

    AdvancedConstructorExamples(String productNameParameter, double productPriceParameter) {
        productName = productNameParameter;
        productPrice = productPriceParameter;
    }


    /*
    ==========================================================
    3. Static Block (Executed Once When Class Loads)
    ==========================================================

    Important Details:
    - Static block runs once when class is loaded.
    - Used for static initialization.
    */

    static {
        System.out.println("Static block executed when class loads.");
        beforeMain();
    }

    public static void beforeMain() {
        System.out.println("Before main called");
    }


    /*
    ==========================================================
    4. Singleton Pattern Constructor
    ==========================================================

    Important Details:
    - Ensures only ONE object of a class exists.
    - Constructor is private.
    - Object is created using a static method.
    */

    private static AdvancedConstructorExamples singleInstance;

    public static AdvancedConstructorExamples getInstance() {

        if (singleInstance == null) {
            System.out.println("singleInstance initialized");
            singleInstance = new AdvancedConstructorExamples();
            singleInstance.productName = "Test product";
        }
        System.out.println("singleInstance obj");

        return singleInstance;
    }


    /*
    Method to display product details
    */

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("-----------------------------");
    }


    public static void main(String[] args) {
        System.out.println("Main called");

        /*
        ==========================================================
        Example 1: Constructor Chaining
        ==========================================================
        */

        AdvancedConstructorExamples productOne =
                new AdvancedConstructorExamples("Laptop");

        productOne.displayProductDetails();

        /*
        Output:
        Static block executed when class loads.
        Product Name: Laptop
        Product Price: 0.0
        -----------------------------
        */


        /*
        ==========================================================
        Example 2: Parameterized Constructor
        ==========================================================
        */

        AdvancedConstructorExamples productTwo =
                new AdvancedConstructorExamples("Smartphone", 45000);

        productTwo.displayProductDetails();

        /*
        Output:
        Product Name: Smartphone
        Product Price: 45000.0
        -----------------------------
        */


        /*
        ==========================================================
        Example 3: Singleton Constructor Usage
        ==========================================================
        */

        AdvancedConstructorExamples instanceOne =
                AdvancedConstructorExamples.getInstance();
        System.out.println("instanceOne obj: " + instanceOne.productName);

        AdvancedConstructorExamples instanceTwo =
                AdvancedConstructorExamples.getInstance();
        System.out.println("instanceTwo obj: " + instanceTwo.productName);

        System.out.println("Are both instances same? " + (instanceOne == instanceTwo));

        /*
        Output:
        Private constructor called
        Are both instances same? true
        */

    }
}