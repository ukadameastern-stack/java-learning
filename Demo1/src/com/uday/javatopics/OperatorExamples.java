package com.uday.javatopics;

public class OperatorExamples {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); // Addition (+) => 13
        System.out.println("a - b = " + (a - b)); // Subtraction (-) => 7
        System.out.println("a * b = " + (a * b)); // Multiplication (*) => 30
        System.out.println("a / b = " + (a / b)); // Division (/) => 3 (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (%) => 1 (remainder)

        // 2. Relational Operators
        System.out.println("a > b: " + (a > b));   // Greater than (>) => true
        System.out.println("a < b: " + (a < b));   // Less than (<) => false
        System.out.println("a == b: " + (a == b)); // Equal to (==) => false
        // java: bad operand types for binary operator '=='
        //  first type:  int
        //  second type: java.lang.String
        // System.out.println(5 == "5");
        System.out.println("a != b: " + (a != b)); // Not equal to (!=) => true
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to (>=) => true
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to (<=) => false

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND (&&) => false
        System.out.println("x || y: " + (x || y)); // Logical OR (||) => true
        System.out.println("!x: " + (!x));         // Logical NOT (!) => false

        // 4. Assignment Operators
        int c = 5;
        c += 3; // Addition assignment (+=) => c = c + 3
        System.out.println("c after += 3: " + c);  // 8
        c *= 2; // Multiplication assignment (*=) => c = c * 2
        System.out.println("c after *= 2: " + c);  // 16
        c -= 4; // Subtraction assignment (-=) => c = c - 4
        System.out.println("c after -= 4: " + c);  // 12
        c /= 3; // Division assignment (/=) => c = c / 3
        System.out.println("c after /= 3: " + c);  // 4
        c %= 3; // Modulus assignment (%=) => c = c % 3
        System.out.println("c after %= 3: " + c);  // 1

        // 5. Unary Operators
        // +, -, ++, --, !, ~
        // + / - → arithmetic
        //
        // ++ / -- → increment/decrement
        //
        // ! → logical NOT
        //
        // ~ → bitwise NOT
        int d = 10;
        System.out.println("d++: " + (d++)); // Post-increment (d++) => 10 then d=11
        // ++d: d is incremented first (12), then assigned to d
        System.out.println("++d: " + (++d)); // Pre-increment (++d) => 12
        System.out.println("d--: " + (d--)); // Post-decrement (d--) => 12 then d=11
        System.out.println("--d: " + (--d)); // Pre-decrement (--d) => 10
        int l = 10;
        int m = 20;

        int additionResult = ++l + m++ + l++;

        System.out.println(additionResult); // 42
        System.out.println(l);      // 12
        System.out.println(m);      // 21

        // 6. Ternary Operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor"; // Ternary (?:) => Adult
        System.out.println("Age result: " + result);

        // 7. Bitwise Operators
        int p = 5;  // 0101 in binary
        int q = 3;  // 0011 in binary
        System.out.println("p & q = " + (p & q)); // Bitwise AND (&) => 1
        System.out.println("p | q = " + (p | q)); // Bitwise OR (|) => 7
        System.out.println("p ^ q = " + (p ^ q)); // Bitwise XOR (^) => 6
        System.out.println("~p = " + (~p));       // Bitwise NOT (~) => -6
        System.out.println("p << 1 = " + (p << 1)); // Left shift (<<) => 10
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift (>>) => 2
        System.out.println("p >>> 1 = " + (p >>> 1)); // Unsigned right shift (>>>) => 2
    }
}