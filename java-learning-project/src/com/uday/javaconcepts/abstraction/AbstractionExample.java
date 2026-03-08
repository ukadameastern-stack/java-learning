package com.uday.javaconcepts.abstraction;

/*
=====================================================================
TOPIC: Abstraction in Java
=====================================================================

Definition:
Abstraction means hiding implementation details and showing only
essential functionality to the user.

Example:
When you drive a car:
- You only use steering, accelerator, brake.
- You do NOT see how the engine internally works.

This is abstraction.

---------------------------------------------------------------------
How Abstraction is Achieved in Java
---------------------------------------------------------------------

1. Abstract Class (0–100% abstraction)
2. Interface (100% abstraction)

---------------------------------------------------------------------
Abstract Class
---------------------------------------------------------------------

- Declared using the keyword "abstract"
- Cannot be instantiated (cannot create objects directly)
- Can contain:
    ✔ Abstract methods (without body)
    ✔ Concrete methods (with body)
    ✔ Variables
    ✔ Constructors

---------------------------------------------------------------------
Abstract Method
---------------------------------------------------------------------

- Method declared without implementation
- Must be implemented by child classes

Example:

abstract void makePayment();

---------------------------------------------------------------------
Benefits of Abstraction
---------------------------------------------------------------------

1. Security (hides internal logic)
2. Code reuse
3. Flexible architecture
4. Easy maintenance

----------------------------------------------------------------------------------------
| Class Type                     | Can We Create Object? | Reason                      |
| ------------------------------ | --------------------- | --------------------------- |
| Normal Class                   | ✔ Yes                 | Fully implemented           |
| Abstract Class                 | ❌ No                  | Contains incomplete methods |
| Interface                      | ❌ No                  | Only blueprint              |
| Enum (using new)               | ❌ No                  | Objects created by JVM      |
| Class with Private Constructor | ❌ Outside class       | Access restricted           |
----------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------
| Case                                         | Allowed? | Syntax                              |
| -------------------------------------------- | -------- | ----------------------------------- |
| Extend multiple classes                      | ❌ No     | `class C extends A, B`              |
| Implement multiple interfaces                | ✔ Yes    | `class C implements A, B`           |
| Extend multiple abstract classes             | ❌ No     | Not allowed                         |
| Extend one class + implement many interfaces | ✔ Yes    | `class C extends A implements B, C` |
-------------------------------------------------------------------------------------------------

----------------------------------------------------
| Concept                                | Allowed |
| -------------------------------------- | ------- |
| Abstract Class                         | ✔       |
| Abstract Method                        | ✔       |
| Abstract Variable / Property           | ❌       |
| Abstract Getter/Setter (property-like) | ✔       |
----------------------------------------------------
=====================================================================
*/


/*
----------------------------------------------------------
ABSTRACT CLASS
----------------------------------------------------------
Represents a generic Payment System
*/
abstract class Payment {

    // abstract int userId; // java: modifier abstract not allowed here
    String userName;

    // Constructor
    Payment(String userName) {
        this.userName = userName;
    }

    /*
    Abstract Method
    Child classes MUST implement this method
    */
    abstract void makePayment(double amount);

    /*
    Concrete Method
    Already implemented
    */
    void displayUser() {
        System.out.println("User Name: " + userName);
    }
}


/*
----------------------------------------------------------
CHILD CLASS 1
----------------------------------------------------------
Implements Credit Card Payment
*/
class CreditCardPayment extends Payment {

    CreditCardPayment(String userName) {
        super(userName);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Processing Credit Card Payment of ₹" + amount);
    }
}


/*
----------------------------------------------------------
CHILD CLASS 2
----------------------------------------------------------
Implements UPI Payment
*/
class UpiPayment extends Payment {

    UpiPayment(String userName) {
        super(userName);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Processing UPI Payment of ₹" + amount);
    }
}


/*
----------------------------------------------------------
MAIN CLASS
----------------------------------------------------------
Demonstrates abstraction
*/
public class AbstractionExample {

    public static void main(String[] args) {

        /*
        Cannot create object of abstract class

        Payment p = new Payment();  ❌ NOT ALLOWED
        */

        System.out.println("------ Credit Card Payment ------");

        Payment creditPayment = new CreditCardPayment("Uday");

        creditPayment.displayUser();
        creditPayment.makePayment(2500);


        System.out.println("\n------ UPI Payment ------");

        Payment upiPayment = new UpiPayment("Rahul");

        upiPayment.displayUser();
        upiPayment.makePayment(1500);

    }
}

/*
=====================================================================
EXPECTED OUTPUT
=====================================================================

------ Credit Card Payment ------
User Name: Uday
Processing Credit Card Payment of ₹2500.0

------ UPI Payment ------
User Name: Rahul
Processing UPI Payment of ₹1500.0

=====================================================================
*/