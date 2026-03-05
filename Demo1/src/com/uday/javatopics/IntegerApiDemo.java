package com.uday.javatopics;

public class IntegerApiDemo {

    public static void main(String[] args) {

        // 1️⃣ Creating Integer Objects
        Integer num1 = 100;                  // Autoboxing
        Integer num2 = Integer.valueOf(200); // Factory method

        System.out.println("num1: " + num1); // 100
        System.out.println("num2: " + num2); // 200


        // 2️⃣ Parsing String to int
        int parsed = Integer.parseInt("123");
        System.out.println("parseInt(): " + parsed); // 123


        // 3️⃣ Converting int to String
        String str = Integer.toString(456);
        System.out.println("toString(): " + str); // 456


        // 4️⃣ Compare integers
        System.out.println("compare(): " + Integer.compare(10, 20));
        // -1 (10 < 20)

        System.out.println("compareTo(): " + num1.compareTo(50));
        // 1 (100 > 50)


        // 5️⃣ Max and Min
        System.out.println("max(): " + Integer.max(10, 20)); // 20
        System.out.println("min(): " + Integer.min(10, 20)); // 10


        // 6️⃣ Sum
        System.out.println("sum(): " + Integer.sum(5, 10));
        // 15


        // 7️⃣ Constants
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
        // 2147483647

        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
        // -2147483648

        System.out.println("BYTES: " + Integer.BYTES);
        // 4

        System.out.println("SIZE (bits): " + Integer.SIZE);
        // 32


        // 8️⃣ Binary, Octal, Hex Conversion
        System.out.println("toBinaryString(): " + Integer.toBinaryString(10));
        // 1010

        System.out.println("toOctalString(): " + Integer.toOctalString(10));
        // 12

        System.out.println("toHexString(): " + Integer.toHexString(255));
        // ff


        // 9️⃣ Bit Operations
        System.out.println("bitCount(): " + Integer.bitCount(10));
        // 2 (1010 has two 1s)

        System.out.println("highestOneBit(): " + Integer.highestOneBit(10));
        // 8

        System.out.println("lowestOneBit(): " + Integer.lowestOneBit(10));
        // 2


        // 🔟 Autoboxing & Unboxing
        Integer boxed = 50;  // Autoboxing
        int unboxed = boxed; // Unboxing
        System.out.println("Unboxed value: " + unboxed); // 50


        // 1️⃣1️⃣ Decode (parses hex, octal, decimal)
        System.out.println("decode(): " + Integer.decode("0xFF"));
        // 255
    }
}