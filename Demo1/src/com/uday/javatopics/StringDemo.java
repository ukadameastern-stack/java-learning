package com.uday.javatopics;

import java.lang.reflect.Method;

public class StringDemo {

    public static void main(String[] args) {
        Method[] methods = String.class.getMethods();
        // Total public methods: 93
        System.out.println("Total public methods: " + methods.length);

        Method[] declaredMethods = String.class.getDeclaredMethods();
        // Declared methods: 148
        System.out.println("Declared methods: " + declaredMethods.length);

        System.out.println("===== STRING CREATION =====");
        String s1 = "com/uday/javatopics";
        String s2 = new String("com/uday/javatopics");
        System.out.println(s1); // Pattern.Java
        System.out.println(s2); // Pattern.Java

        System.out.println("\n===== LENGTH =====");
        System.out.println(s1.length()); // 4

        System.out.println("\n===== CHARACTER ACCESS =====");
        System.out.println(s1.charAt(2)); // v

        System.out.println("\n===== STRING COMPARISON 1 =====");
        String s3 = "java";
        System.out.println(s1.equals(s3));          // false
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println(s1 == s2); // false (reference check)

        System.out.println("\n===== STRING COMPARISON 2 =====");
        String s34 = "com/uday/javatopics";
        System.out.println(s1.equals(s34));          // true
        System.out.println(s1.equalsIgnoreCase(s34)); // true
        System.out.println(s1 == s34);               // true

        System.out.println("\n===== CONCATENATION =====");
        String s4 = s1.concat(" Programming world!");
        System.out.println(s4); // Pattern.Java Programming world!
        String s5 = s1 + " 21";
        System.out.println(s5); // Pattern.Java 21

        System.out.println("\n===== SUBSTRING =====");
        System.out.println(s4.substring(5)); // Programming world!
        System.out.println(s4.substring(0, 6)); // Pattern.Java P

        System.out.println("\n===== SEARCHING =====");
        System.out.println(s4.contains("Program")); // true
        System.out.println(s4.indexOf("a")); // 1
        System.out.println(s4.lastIndexOf("a")); // 10

        System.out.println("\n===== STARTS / ENDS WITH =====");
        System.out.println(s4.startsWith("com/uday/javatopics")); // true
        System.out.println(s4.endsWith("world")); // false
        System.out.println(s4.endsWith("world!")); // true

        System.out.println("\n===== CASE CONVERSION =====");
        System.out.println(s4.toUpperCase()); // JAVA PROGRAMMING WORLD!
        System.out.println(s4.toLowerCase()); // java programming world!

        System.out.println("\n===== TRIM =====");
        String s6 = "   Hello World   ";
        System.out.println(s6.trim()); // "Hello World"

        System.out.println("\n===== REPLACE =====");
        System.out.println(s4.replace("com/uday/javatopics", "Python")); // Python Programming world!
        System.out.println(s4.replace('a', 'x')); // Jxvx Progrxmming world!

        System.out.println("\n===== SPLIT =====");
        String sentence = "Pattern.Java is powerful and secure";
        String[] words = sentence.split(" ");
        for (String word : words) {
            /*
                ===== SPLIT =====
                Pattern.Java
                is
                powerful
                and
                secure
             */
            System.out.println(word);
        }

        System.out.println("\n===== JOIN =====");
        String joined = String.join("-", "2026", "03", "03");
        System.out.println(joined); // 2026-03-03

        System.out.println("\n===== VALUE CONVERSION =====");
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println(numStr); // 100

        System.out.println("\n===== STRING FORMAT =====");
        String formatted = String.format("Name: %s, Age: %d", "Uday", 25);
        System.out.println(formatted); // Name: Uday, Age: 25

        System.out.println("\n===== IMMUTABILITY DEMO =====");
        String original = "Hello";
        original.concat(" World");
        System.out.println(original); // unchanged means -> Hello

        original = original.concat(" World");
        System.out.println(original); // changed after reassignment -> Hello World

        System.out.println("\n===== STRING BUILDER (Mutable) =====");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World

        System.out.println("\n===== EMPTY CHECK =====");
        String emptyStr = "";
        System.out.println(emptyStr.isEmpty()); // true
        System.out.println(emptyStr.isBlank()); // true

        System.out.println("\n===== COMPARE TO (Lexicographical) =====");
        System.out.println("Apple".compareTo("Banana")); // negative
        System.out.println("Banana".compareTo("Apple")); // positive
        System.out.println("Apple".compareTo("Apple"));  // zero
        /* *
            ===== COMPARE TO (Lexicographical) =====
            -1
            1
            0
         */
    }
}