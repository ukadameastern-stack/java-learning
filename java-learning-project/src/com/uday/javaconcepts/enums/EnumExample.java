package com.uday.javaconcepts.enums;

/**
 * Java 21 ENUM - REAL-TIME EXAMPLES
 *
 * Key Concepts Covered:
 * 1. Basic Enum
 * 2. Enum with Fields & Constructor
 * 3. Enum with Methods (Business Logic)
 * 4. Enum in Switch (Java 21 style)
 * 5. Enum implementing Interface
 * 6. Real-time Use Cases (Payment, Order Status, Roles)
 */

// 1. BASIC ENUM
enum Status {
    SUCCESS,
    FAILURE,
    PENDING;
}

// 2. ENUM WITH FIELDS + CONSTRUCTOR

enum PaymentStatus {
    SUCCESS(200, "Payment Successful"),
    FAILED(500, "Payment Failed"),
    PENDING(102, "Payment Pending");

    private final int code;
    private final String message;

    PaymentStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

// 3. ENUM WITH BUSINESS LOGIC

enum DiscountType {
    FIXED {
        @Override
        public double apply(double price) {
            return price - 100;
        }
    },
    PERCENTAGE {
        @Override
        public double apply(double price) {
            return price - (price * 0.10);
        }
    };

    public abstract double apply(double price);
}

// 4. ENUM IN SWITCH (Java 21 Modern Switch)

class OrderService {

    public static String getOrderMessage(Status status) {
        return switch (status) {
            case SUCCESS -> "Order completed";
            case FAILURE -> "Order failed";
            case PENDING -> "Order in progress";
        };
    }
}

// 5. ENUM IMPLEMENTING INTERFACE

interface Operation {
    int apply(int a, int b);
}

enum CalculatorOperation implements Operation {
    ADD {
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int apply(int a, int b) {
            return a - b;
        }
    };
}

// 6. REAL-TIME EXAMPLE: USER ROLE MANAGEMENT

enum UserRole {
    ADMIN,
    USER,
    GUEST;

    public boolean canDelete() {
        return this == ADMIN;
    }
}

// MAIN CLASS FOR TESTING

public class EnumExample {

    public static void main(String[] args) {

        // 1. BASIC ENUM
        Status status = Status.SUCCESS;
        System.out.println(status);
        System.out.println(status.name());
        // OUTPUT: SUCCESS


        // 2. ENUM WITH FIELDS
        PaymentStatus payment = PaymentStatus.SUCCESS;
        System.out.println(payment.getCode());
        System.out.println(payment.getMessage());
        /*
        OUTPUT:
        200
        Payment Successful
        */


        // 3. ENUM WITH BUSINESS LOGIC
        double price = 1000;
        double finalPrice = DiscountType.PERCENTAGE.apply(price);
        System.out.println(finalPrice);
        // OUTPUT: 900.0


        // 4. SWITCH WITH ENUM
        String message = OrderService.getOrderMessage(Status.PENDING);
        System.out.println(message);
        // OUTPUT: Order in progress


        // 5. ENUM IMPLEMENTING INTERFACE
        int result = CalculatorOperation.ADD.apply(10, 5);
        System.out.println(result);
        // OUTPUT: 15

        CalculatorOperation calc = CalculatorOperation.SUBTRACT;
        System.out.println(calc.apply(20, 10));
        // OUTPUT: 10


        // 6. REAL-TIME ROLE CHECK
        UserRole role = UserRole.ADMIN;
        System.out.println(role.canDelete());
        // OUTPUT: true


        // 7. ITERATING ENUM VALUES
        for (PaymentStatus ps : PaymentStatus.values()) {
            System.out.println(ps + " -> " + ps.getCode());
        }
        /*
        OUTPUT:
        SUCCESS -> 200
        FAILED -> 500
        PENDING -> 102
        */
    }
}

/**
 * ==============================
 * DETAILED EXPLANATION
 * ==============================
 *
 * 1. ENUM = Type-safe constant
 *    - Prevents invalid values
 *    - Example: Status cannot be "DONE"
 *
 * 2. ENUM WITH FIELDS
 *    - Used like mini class
 *    - Real-time: API response codes, error messages
 *
 * 3. ENUM WITH METHODS
 *    - Encapsulates logic inside enum
 *    - Avoids if-else or switch
 *
 * 4. SWITCH WITH ENUM
 *    - Cleaner logic in Java 21
 *
 * 5. ENUM + INTERFACE
 *    - Strategy pattern implementation
 *    - Each constant behaves differently
 *
 * 6. REAL-TIME USAGE
 *    - PaymentStatus -> Payment gateway
 *    - DiscountType -> E-commerce pricing
 *    - UserRole -> Authorization
 *
 * ==============================
 * BEST PRACTICES
 * ==============================
 * ✔ Use enum instead of constants (static final)
 * ✔ Keep logic inside enum when related
 * ✔ Avoid storing mutable data
 * ✔ Use enums for fixed domain values
 *
 */
