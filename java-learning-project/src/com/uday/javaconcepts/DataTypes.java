package com.uday.javaconcepts;

public class DataTypes {
    static int id = 105;
    int rollNo = 110;

    byte a;
    short sh;
    int b;
    Integer b2 = 10;

    float f;
    double d;
    boolean g;
    char ch;
    String str;
    int[]  arr ;

    public static void primitive() {
        System.out.println("Primitive data types:");
        byte a = 10; // -128 to 127
        short sh = 32767; // -32,768 to 32,767
        // short sh = 32768; // error: incompatible types: possible lossy conversion from int to short
        // int b = new Integer(1000); // 'Integer(int)' is deprecated since version 9 and marked for removal
        int b = 1000; // ±2.1 billion
        // Very large (±9 quintillion)
        long c = 9999999999L; // For long value need to provide the L as suffix
        long c2 = 9999999999l;
        float d = 10.51F; // ~6-7 decimal digits
        // 20.123456789101112
        double e = 20.12345678910111213141516; // ~15 decimal digits
        char f = 'K'; // Only in single quote, Single Unicode character
        boolean g = true; // true / false
        printWithType(a);
        printWithType(sh);
        printWithType(b);
        printWithType(c);
        printWithType(c2);
        printWithType(d);
        printWithType(e);
        printWithType(f);
        printWithType(g);
        DataTypes dt = new DataTypes();
        dt.defaults();
    }

    public static void nonPrimitive() {
        System.out.println("Non-primitive data types:");
        String name = "Uday"; // String should be enclosed in between "".
        String s = null;   // valid
        // int x = null;      // Null not allowed
        int[] numbers = {1, 2, 3};
        class Student {
            int rollNo;
        }
        interface Animal {
            void sound();
        }
        enum Day {
            MONDAY, TUESDAY
        }
        System.out.println(name.length());
        System.out.println(numbers.length);
        printWithType(name);
        // printWithType(s); // Passing 'null' argument to parameter annotated as @NotNull
        printWithType(numbers);
        printWithType(new Student());
        // printWithType(new Animal()); // 'Animal' is abstract; cannot be instantiated
        // printWithType(new Day()); // Enum types cannot be instantiated

        String s3 = "Hello";
        s3 = s3 + " World";
        System.out.println(s3);
        String s1 = "com/uday/javatopics";
        String s2 = s1;

        s1 = s1 + " Programming";

        System.out.println(s1);
        System.out.println(s2);
        printWithType(id);
    }

    public void defaults() {
        printWithType(a);
        printWithType(sh);
        printWithType(b);
        printWithType(f);
        printWithType(d);
        printWithType(g);
        printWithType(ch);
        System.out.println(str);
        System.out.println(arr);
        str = "USKAL";
        System.out.println(str);

        System.out.println("======================" + getB2().getClass());
    }

    public static void main(String[] args) {
        System.out.println("In Data type class!");
        primitive();
        nonPrimitive();
    }

    private static void printWithType(Object obj) {
        System.out.println(obj + " → " + obj.getClass().getSimpleName() + " → " + obj.getClass());
    }

    public Integer getB2() {
        return b2;
    }
}

