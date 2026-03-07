package com.uday.javaconcepts;

public class WrapperTypesApiDemo {

    public static void main(String[] args) {

        // ===================== BYTE =====================
        Byte b1 = Byte.valueOf((byte)10);
        byte bParsed = Byte.parseByte("20");

        System.out.println("Byte MAX: " + Byte.MAX_VALUE);     // 127
        System.out.println("Byte MIN: " + Byte.MIN_VALUE);     // -128
        System.out.println("Byte compare: " + Byte.compare((byte)5, (byte)3)); // 1


        // ===================== SHORT =====================
        Short s1 = Short.valueOf((short)1000);
        short sParsed = Short.parseShort("2000");

        System.out.println("Short MAX: " + Short.MAX_VALUE);   // 32767
        System.out.println("Short MIN: " + Short.MIN_VALUE);   // -32768
        // error: cannot find symbol
        // System.out.println("Short sum: " + Short.sum((short)5, (short)10)); // 15
        short result = (short) (5 + 10);
        System.out.println("Short sum: " + result); // 15


        // ===================== LONG =====================
        Long l1 = Long.valueOf(100000L);
        long lParsed = Long.parseLong("200000");

        System.out.println("Long MAX: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Long MIN: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Long toBinary: " + Long.toBinaryString(10)); // 1010
        System.out.println("Long compare: " + Long.compare(50L, 20L));   // 1


        // ===================== FLOAT =====================
        Float f1 = Float.valueOf(10.5f);
        float fParsed = Float.parseFloat("20.5");

        System.out.println("Float MAX: " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println("Float MIN: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Float isNaN: " + Float.isNaN(0.0f / 0.0f)); // true
        System.out.println("Float sum: " + Float.sum(5.5f, 2.5f)); // 8.0


        // ===================== DOUBLE =====================
        Double d1 = Double.valueOf(100.55);
        double dParsed = Double.parseDouble("200.75");

        System.out.println("Double MAX: " + Double.MAX_VALUE);
        System.out.println("Double MIN: " + Double.MIN_VALUE);
        System.out.println("Double isInfinite: " + Double.isInfinite(1.0 / 0.0)); // true
        System.out.println("Double compare: " + Double.compare(5.5, 2.2)); // 1


        // ===================== CHARACTER =====================
        Character c1 = Character.valueOf('A');

        System.out.println("isLetter: " + Character.isLetter('A'));      // true
        System.out.println("isDigit: " + Character.isDigit('5'));        // true
        System.out.println("isUpperCase: " + Character.isUpperCase('A'));// true
        System.out.println("toLowerCase: " + Character.toLowerCase('A'));// a


        // ===================== BOOLEAN =====================
        Boolean bool1 = Boolean.valueOf(true);
        boolean parsedBool = Boolean.parseBoolean("true");

        System.out.println("Boolean TRUE: " + Boolean.TRUE);     // true
        System.out.println("Boolean FALSE: " + Boolean.FALSE);   // false
        System.out.println("Logical AND: " + Boolean.logicalAnd(true, false)); // false
        System.out.println("Logical OR: " + Boolean.logicalOr(true, false));   // true
    }
}