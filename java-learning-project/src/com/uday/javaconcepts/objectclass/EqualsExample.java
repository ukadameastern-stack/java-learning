package com.uday.javaconcepts.objectclass;

/*
    CONCEPT: equals()

    Used to compare object values.

    ==  -> compares memory reference
    equals() -> compares object data

    Default equals() from Object class behaves like ==.
*/

public class EqualsExample {

    public static void main(String[] args) {

        System.out.println("========== Testing equals without method overriding ========= ");
        Student s1 = new Student(1, "Uday");
        Student s2 = new Student(1, "Uday");

        System.out.println(s1.hashCode()); // 2065951873
        System.out.println(s2.hashCode()); // 1791741888
        System.out.println(s1.equals(s2)); // false

        System.out.println("========== Testing equals method overriding comparing content ========= ");
        Teacher t1 = new Teacher(1, "Uday");
        Teacher t2 = new Teacher(1, "Uday");
        // If we are not overriding the hashCode method then it wil not same memory.
        // System.out.println(t1.hashCode()); // 1072408673
        // System.out.println(t2.hashCode()); // 1531448569

        // Here you can see after overriding the hashCode() address will be the same.
        // NOTE: When we override the equals() then also override the hashCode().
        System.out.println(t1.hashCode()); // 2631464
        System.out.println(t2.hashCode()); // 2631464
        System.out.println(t1.equals(t2)); // true
        // 'equals' between objects of inconvertible types 'Teacher' and 'Student'
        // System.out.println(t1.equals(s1));

    }
}

/*
OUTPUT:

========== Testing equals without method overriding =========
2065951873
1791741888
false
========== Testing equals method overriding comparing content =========
2631464
2631464
true

Explanation:
========== Testing equals without method overriding =========
Both objects contain same id and name,
but both objects return different hashCode (memory location).

========== Testing equals method overriding comparing content =========
Both objects contain same id and name,
but here we did the method overriding and there we are checking content not the address.
*/