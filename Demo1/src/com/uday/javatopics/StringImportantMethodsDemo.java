package com.uday.javatopics;

public class StringImportantMethodsDemo {

    public static void main(String[] args) {

        String str = "  Pattern.Java Programming  ";
        String str2 = "java programming";

        System.out.println("1. length(): " + str.length());
        // 20

        System.out.println("2. charAt(): " + str.charAt(2));
        // J

        System.out.println("3. substring(begin): " + str.substring(2));
        // Pattern.Java Programming

        System.out.println("4. substring(begin, end): " + str.substring(2, 6));
        // Pattern.Java

        System.out.println("5. equals(): " + str.equals(str2));
        // false

        System.out.println("6. equalsIgnoreCase(): " + str.equalsIgnoreCase(str2));
        // false (because of leading/trailing spaces)

        System.out.println("7. compareTo(): " + str.compareTo(str2));
        // negative value (uppercase 'J' < lowercase 'j')

        System.out.println("8. compareToIgnoreCase(): " + str.compareToIgnoreCase(str2));
        // negative value (due to spaces)

        System.out.println("9. contains(): " + str.contains("Program"));
        // true

        System.out.println("10. indexOf(): " + str.indexOf("a"));
        // 3

        System.out.println("11. lastIndexOf(): " + str.lastIndexOf("a"));
        // 10

        System.out.println("12. startsWith(): " + str.trim().startsWith("com/uday/javatopics"));
        // true

        System.out.println("13. endsWith(): " + str.trim().endsWith("ing"));
        // true

        System.out.println("14. toUpperCase(): " + str.toUpperCase());
        //   JAVA PROGRAMMING  

        System.out.println("15. toLowerCase(): " + str.toLowerCase());
        //   java programming  

        System.out.println("16. trim(): '" + str.trim() + "'");
        // 'Pattern.Java Programming'

        System.out.println("17. replace(): " + str.replace("com/uday/javatopics", "Python"));
        //   Python Programming  

        System.out.println("18. replaceAll(): " + str.replaceAll("a", "@"));
        //   J@v@ Progr@mming  

        String sentence = "Pattern.Java is powerful";
        String[] words = sentence.split(" ");

        System.out.println("19. split(): ");
        // Pattern.Java
        // is
        // powerful
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("20. join(): " + String.join("-", "2026", "03", "03"));
        // 2026-03-03

        System.out.println("21. valueOf(): " + String.valueOf(100));
        // 100

        System.out.println("22. format(): " +
                String.format("Name: %s, Age: %d", "Uday", 25));
        // Name: Uday, Age: 25

        System.out.println("23. isEmpty(): " + "".isEmpty());
        // true

        System.out.println("24. isBlank(): " + "   ".isBlank());
        // true

        System.out.println("25. strip(): '" + str.strip() + "'");
        // 'Pattern.Java Programming'

        int a = 10;
        int b = 20;
        System.out.println(a + b); // 30
        String res = "Addition of :";
        System.out.println(a + b + res); // 30Addition of :
        System.out.println(res + a + b); // Addition of :1020
        System.out.println(res + (a + b)); // Addition of :30

    }
}